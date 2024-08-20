package com.eba.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eba.entity.accounts;

public class accountsDAO {

	public accounts findAccounts() {

		int loginId;
		String password;
		//DB設定
		String URL="jdbc:mysql://localhost:3306/WEB_APP_DB";
		String User="root";
		String Password="jacker11001";
        try{
			//JDBCクラスをロード
            Class.forName("com.mysql.cj.jdbc.Driver");

			//DBコネクション作成
			try(Connection connection=DriverManager.getConnection(URL, User, Password)){
				//SQL文の作成
				PreparedStatement ps=connection.prepareStatement("SELECT * FROM accounts WHERE user_id = 1");
				//SQL文の実行
				ResultSet result=ps.executeQuery();

				//結果の格納
				loginId=result.getInt("user_id");
				password=result.getString("password");

			}
			
			return new accounts(loginId,password);

		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
