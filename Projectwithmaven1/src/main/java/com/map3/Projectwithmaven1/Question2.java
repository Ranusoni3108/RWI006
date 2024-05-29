package com.map3.Projectwithmaven1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.map2.Projectwithmaven1.Answer1;

public class Question2 {

	@Id
	@Column(name="Question_Id")
		private int queid;
		private String que;
		
		@OneToMany(mappedBy="question",fetch=FetchType.EAGER) 
		private List<Answer1>answer;

		
		public int getQueid() {
			return queid;
		}

		public void setQueid(int queid) {
			this.queid = queid;
		}

		public String getQue() {
			return que;
		}

		public void setQue(String que) {
			this.que = que;
		}
	

           public Question2(int queid, String que, List<Answer1> ans) {
			super();
			this.queid = queid;
			this.que = que;
			this.answer = ans;
		}

           public List<Answer1> getAns() {
			return answer;
		}

		public void setAns(List<Answer1> ans) {
			this.answer = ans;
		}

		public Question2() {
			super();
			// TODO Auto-generated constructor stub
		}

      }

