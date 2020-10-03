package dip.refactor.before;

public class RefactorExampleUserBefore {
	private RefactorExampleBefore refactorExample;

	public RefactorExampleUserBefore(RefactorExampleBefore refactorExample) {
		super();
		this.refactorExample = refactorExample;
	}

	public RefactorExampleBefore getRefactorExample() {
		return refactorExample;
	}

	public void setRefactorExample(RefactorExampleBefore refactorExample) {
		this.refactorExample = refactorExample;
	}
}
