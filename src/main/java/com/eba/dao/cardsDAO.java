package com.eba.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.eba.entity.cards;

public class cardsDAO {
    public List<cards> findAll() {

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
				PreparedStatement ps=connection.prepareStatement("SELECT * FROM cards");
				//SQL文の実行
				ResultSet result=ps.executeQuery();

				//結果の格納
				List<cards> list= new ArrayList<>();
				while (result.next()) {
					int card_id=result.getInt("card_id");
					String corporation=result.getString("corporation");
					String name=result.getString("name");
					String email=result.getString("email");
					int tel=result.getInt("tel");
					String address=result.getString("address");
					String author=result.getString("author");
					String memo=result.getString("memo");
					list.add(new cards(card_id,corporation,name,email,tel,address,author,memo));
				}
				return list;
			}

		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
