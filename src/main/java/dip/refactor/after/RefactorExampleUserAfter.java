package dip.refactor.after;

public class RefactorExampleUserAfter {
	private IRefactorExampleAfter refactorExample;

	public RefactorExampleUserAfter(IRefactorExampleAfter refactorExample) {
		super();
		this.refactorExample = refactorExample;
	}

	public IRefactorExampleAfter getRefactorExample() {
		return refactorExample;
	}

	public void setRefactorExample(IRefactorExampleAfter refactorExample) {
		this.refactorExample = refactorExample;
	}
}
