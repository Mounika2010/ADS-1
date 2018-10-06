/**
 * Class for student information.
 */
class StudentInfo implements Comparable<StudentInfo> {
	String studentName;
	String dateofbirth;
	int sub1;
	int sub2;
	int sub3;
	int totalmarks;
	String reserveCat;

	/**
	 * Constructs the object.
	 *
	 * @param      studentName  The student name
	 * @param      dateofbirth  The dateofbirth
	 * @param      sub1         The sub 1 marks
	 * @param      sub2         The sub 2 marks
	 * @param      sub3         The sub 3 marks
	 * @param      totalmarks   The totalmarks
	 * @param      reserveCat   The reservation category
	 */
	StudentInfo(String studentName, String dateofbirth, int sub1, int sub2, int sub3, int totalmarks, String reserveCat) {
		this.studentName = studentName;
		this.dateofbirth = dateofbirth;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.totalmarks = totalmarks;
		this.reserveCat = reserveCat;
	}

	/**
	 * Gets the student name.
	 *
	 * @return     The stu name.
	 */
	public String getStuName() {
		return this.studentName;
	}

	/**
	 * Gets the date of birth.
	 *
	 * @return     The dob.
	 */
	public String getDob() {
		return this.dateofbirth;
	}

	/**
	 * gets subject1 marks.
	 *
	 * @return   sub1 marks
	 */
	public int getsub1marks() {
		return this.sub1;
	}

	/**
	 * gets subject2 marks.
	 *
	 * @return     sub2 marks
	 */
	public int getsub2marks() {
		return this.sub2;
	}
	/**
	 * gets subject3 marks.
	 *
	 * @return     sub3 marks.
	 */
	public int getsub3marks() {
		return this.sub3;
	}
	/**
	 * gets total marks.
	 *
	 * @return     total marks.
	 */
	public int totalmarks() {
		return this.totalmarks;
	}
	/**
	 * gets reservation category.
	 *
	 * @return     reserve category.
	 */
	public String getreserveCat() {
		return this.reserveCat;
	}
	/**
	 * Sets the student name.
	 *
	 * @param      studentName  The student name
	 */
	public void setStuName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * Sets the date of birth.
	 *
	 * @param      dateofbirth  The dateofbirth
	 */
	public void setDob(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	/**
	 * sets subject1 marks.
	 *
	 * @param      sub1  The sub1 marks.
	 */
	public void setsub1marks(int sub1) {
		this.sub1 = sub1;
	}
	/**
	 * sets subject3 marks.
	 * @param      sub2  The sub2 marks
	 */
	public void setsub2marks(int sub2) {
		this.sub2 = sub2;
	}
	/**
	 * sets subject3 marks.
	 *
	 * @param      sub3  The sub3 marks.
	 */
	public void setsub3marks (int sub3) {
		this.sub3 = sub3;
	}
	/**
	 * sets total marks.
	 *
	 * @param      totalmarks  The totalmarks
	 */
	public void settotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	/**
	 * sets reservation category.
	 *
	 * @param      reserveCat  The reserve category.
	 */
	public void setreserveCat(String reserveCat) {
		this.reserveCat = reserveCat;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return this.studentName;
	}

	public int compareTo(StudentInfo that) {
		if(this.totalmarks > that.totalmarks) return -1;
		if(this.totalmarks < that.totalmarks) return 1;
		if(this.sub1 > that.sub1) return -1;
		if(this.sub1 < that.sub2) return 1;
		if(this.sub2 > that.sub2) return -1;
		if(this.sub2 < that.sub2) return 1;
		if(this.sub3 > that.sub3) return -1;
		if(this.sub3 < that.sub3) return 1;
		if(this.dateofbirth > that.dateofbirth) return -1;
		if(this.dateofbirth < that.dateofbirth) return 1;
		return 0;
	}





}