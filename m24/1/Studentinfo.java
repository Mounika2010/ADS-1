/**
 * Class for student.
 */
class Student {
    /**
     * rollno var_description.
     */
    private String roll_num;
    /**
     * name var_description.
     */
    private String student_name;
    /**
     * marks var_description.
     */
    private Double total_marks;
    /**
     * Constructs the object.
     *
     * @param      r     { parameter_description }
     * @param      n     { parameter_description }
     * @param      m     { parameter_description }
     */
    Student(final String rollnum, final String stuname, final Double totalmarks) {
        this.roll_num = rollnum;
        this.student_name = stuname;
        this.total_marks = totalmarks;
    }
    /**
     * get rollno.
     *
    
 * @return     { description_of_the_return_value }
     */
    public String getrollnum() {
        return roll_num;
    }
    /**
     * get name.
     *
     * @return     { description_of_the_return_value }
     */
    public String getStudentname() {
        return student_name;
    }
    /**
     * get marks.
     *
     * @return     { description_of_the_return_value }
     */
    public Double getTotalmarks() {
        return total_marks;
    }
}