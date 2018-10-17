package com.hiber.crud.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.log4j.Logger;

public class AppMain {

    public final static Logger logger = Logger.getLogger(AppMain.class);

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\FPT Slovakia\\Downloads\\importThis.txt");
        try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){

            String currentLine;
            while((currentLine = reader.readLine()) != null){
                DbOperations.createRecord(currentLine);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
//
//
//
//        logger.info(".......Hibernate Crud Operations Example.......\n");
//
//        logger.info("\n=======CREATE RECORDS=======\n");
//
//        logger.info("\n=======READ RECORDS=======\n");
//        List<Student> viewStudents = DbOperations.displayRecords();
//        if(viewStudents != null & viewStudents.size() > 0) {
//            for(Student studentObj : viewStudents) {
//                logger.info(studentObj.toString());
//            }
//        }
//
//        logger.info("\n=======UPDATE RECORDS=======\n");
//        int updateId = viewStudents.get(0).getId();
//        DbOperations.updateRecord(updateId);
//        logger.info("\n=======READ RECORDS AFTER UPDATION=======\n");
//        List<Student> updateStudent = DbOperations.displayRecords();
//        if(updateStudent != null & updateStudent.size() > 0) {
//            for(Student studentObj : updateStudent) {
//                logger.info(studentObj.toString());
//            }
//        }
//
//        logger.info("\n=======DELETE RECORD=======\n");
//        int deleteId = viewStudents.get(4).getId();
//        DbOperations.deleteRecord(deleteId);
//        logger.info("\n=======READ RECORDS AFTER DELETION=======\n");
//        List<Student> deleteStudentRecord = DbOperations.displayRecords();
//        for(Student studentObj : deleteStudentRecord) {
//            logger.info(studentObj.toString());
//        }
//
//        logger.info("\n=======DELETE ALL RECORDS=======\n");
//        DbOperations.deleteAllRecords();
//        logger.info("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
//        List<Student> deleteAll = DbOperations.displayRecords();
//        if(deleteAll.size() == 0) {
//            logger.info("\nNo Records Are Present In The Database Table!\n");
//        }
        System.exit(0);
    }
}