package com.san.service.Impl;

import java.sql.SQLException;

import com.san.dao.Impl.IntegralDaoImpl;
import com.san.model.User;

public class IntegralServiceImpl {
	//积分使用记录处理
	IntegralDaoImpl integralDaoImpl=new IntegralDaoImpl();
	QuestionServiceImpl questionServiceImpl=new QuestionServiceImpl();
	/**
	 * @param userId	用户编号
	 * @param useType	使用类型
	 * @param useNumber 使用数目
	 * @return
	 */
	public int  boutiqueReduceService(int userId,String useType,int useNumber){
		try {
			return integralDaoImpl.boutiqueReducePoints(userId, useType, useNumber);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	//问题积分是否够
	public User isQuestionPointsService(int userId,String questionReward,
			String questionTitle,String questionContent,String courseName){
		int intquestionReward=Integer.parseInt(questionReward);
		try {
			User user= integralDaoImpl.isQuestionPoints(userId, intquestionReward);
			if(user!=null){
				//积分够用,插入问题信息
				questionServiceImpl.insertQuestServiceImpl(userId, questionTitle, questionContent, questionReward, courseName);
				//更新用户积分使用记录
				integralDaoImpl.boutiqueReducePoints(userId, "提出问题:"+questionTitle, -intquestionReward);
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}