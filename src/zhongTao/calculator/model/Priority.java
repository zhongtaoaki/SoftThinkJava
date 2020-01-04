package zhongTao.calculator.model;

/**
 * 優先度を保つ列挙型
 */
public enum Priority {

	add(0), //
	minus(0), //
	multipy(1), //
	devide(1), //
	leftBracket(-1), //
	rightBracket(-2), //
	degital(-3);//

	private int priority;

	public int getValue() {
		return priority;
	}

	private Priority(int priority) {
		this.priority = priority;
	}

}
