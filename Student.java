class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;

	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}


	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}
	//TODO constructor

	//TODO seters & getters

	public double getAverage() {
		int sum = 0;
		for (int i:this.grades
			 ) { sum += i;

		}
		return sum / grades.size();
	}

	public int ECTSCredits() {
		int krediti = 0;
		for (int i:grades
			 ) { if(i >= 6){
			 	krediti += 6;
		}
		}
		return krediti;
	}
}
