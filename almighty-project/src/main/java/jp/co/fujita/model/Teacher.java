package jp.co.fujita.model;

public abstract class Teacher {

	protected StudentList studentList;

	/**
	 * 学生リストを作成する。
	 */
	public abstract void createStudentList(StudentList studentList);

	/**
	 * 学生リストを順繰りに出力する。
	 */
	public abstract void callStudents(StudentList studentList);

}
