package com.covalanse.java.assignment.six;

import lombok.extern.java.Log;

@Log
public class Prob1 {
	public static void main(String[] args) {
		QuestionOne q1 = new QuestionOne();
		q1.id = 11;
		q1.name = "Sam";
		QuestionOne q2 = new QuestionOne();
		q2.id = 22;
		q2.name = "Roby";
		QuestionOne[] que = { q1, q2 };
		log.info("" + que.length);

	}
}
