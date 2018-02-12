package com.esmond.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.esmond.board.dto.BDto;


//@Repository
@Service
public class BDao {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.esmond.board.mappers.postMapper";
	
	public BDao() {}
	
	public List<BDto> selectPost() {
		return sqlSession.selectList("selectPost");
	}

	public void write(String writer, String title, String content) {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("writer", writer);
//		params.put("title", title);
//		params.put("content", content);
		
		BDto params = new BDto();
		params.setWriter(writer);
		params.setTitle(title);
		params.setContent(content);
		
		sqlSession.insert("writePost", params);
	}
	
//	public void write(String writer, String title, String content) {
//		
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			String query = "INSERT INTO POST (writer, title, content) VALUES ('" + writer + "', '" + title + "', '" + content + "')";
//			preparedStatement = connection.prepareStatement(query);
//			int num = preparedStatement.executeUpdate();
//			System.out.println(Integer.toString(num) + " row inserted successfully"); 
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();	
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		
//	}
	
}
