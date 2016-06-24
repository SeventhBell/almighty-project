package jp.co.fujita.model;

import java.util.ArrayList;
import java.util.List;;

/**
 * Studentクラスの集合体クラス</br>
 * デザインパターンIteratorを実装
 *
 * @author 22226
 *
 */
public class StudentList {

	protected List<Student> students;
	protected int last;

	public StudentList(int studentsCount) {
		this.students = new ArrayList<Student>();
		this.last = 0;
	}

	/**
	 * 配列の最後にStudentオブジェクトを追加する。
	 *
	 * @param student
	 */
	public void add(Student student) {
		students.add(student);
		last++;
	}

	/**
	 * 指定した箇所のStudentオブジェクトを更新する。 </br>
	 * 配列の最後尾を表すメンバlastがupdate対象未満の場合、 更新処理を中止する。
	 *
	 * @param index
	 * @param student
	 */
	public void update(int index, Student student) {

	}

	/**
	 * 指定した箇所のStudentオブジェクトを獲得する。
	 *
	 * @param index
	 * @return
	 */
	public Student getStudentAt(int index) {
		return students.get(index);
	}

	/**
	 * 指定した箇所のStudentオブジェクトを削除する。
	 *
	 * @param index
	 */
	public void deleteStudentAt(int index) {
		students.remove(index);
		last--;
	}

}
