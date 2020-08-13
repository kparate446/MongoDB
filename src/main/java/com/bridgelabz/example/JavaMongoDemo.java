package com.bridgelabz.example;

import com.mongodb.MongoClient;  
import com.mongodb.client.MongoCollection;  
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;  
public class JavaMongoDemo {  
	@SuppressWarnings("resource")
	public static void main(String[] args){  
		try{  
			// Connecting DataBase 
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );  
			// Creating DataBase   
			MongoDatabase db = mongoClient.getDatabase("Book");  
			// Creating Collection   
			MongoCollection<Document> table = db.getCollection("BookStore");  
			// Creating Document     
			Document doc = new Document("name", "Krunal Parate");  
			doc.append("id",12);  
			// Inserting Data //  
			table.insertOne(doc);  
		}catch(Exception e){  
			System.out.println(e);  
		}  
	}  
}  