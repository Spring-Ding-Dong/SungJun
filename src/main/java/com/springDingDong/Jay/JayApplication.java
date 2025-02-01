package com.springDingDong.Jay;

import com.springDingDong.Jay.assignment1.JayStudyClass;
import com.springDingDong.Jay.assignment1.JayStudyInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JayApplication.class, args);

		JayStudyClass jayStudyclass = new JayStudyClass();
		String TODO = jayStudyclass.TODO;
		System.out.print(TODO);
		jayStudyclass.doDdanzit("졸기",2);
		jayStudyclass.doGame("황새오래걷기",3);
		jayStudyclass.getTeacherSaids();

	}
}
