package basics;

public class Ttt {

	public boolean isVictory(Board b, char pc) {
		if (isH(b.getBoard(), pc))
		{
			return true;
		}

		if (isV(b.getBoard(), pc))
		{
			return true;
		}

		if (isD(b.getBoard(), pc)) {
			return true;
		}

		return false;
	}

	private boolean isH(char[][] b, char pc) {
		if (b[0][0] == pc && b[0][1] == pc && b[0][2] == pc) {
		return true;
		} else if (b[1][0] == pc && b[2][1] == pc && b[1][2] == pc) {
		return true;
		} else if (b[2][0] == pc && b[2][1] == pc && b[2][2] == pc) {return true;
		} else {
			return false;
		}
	}

	private boolean isV(char[][] b, char pc) {
		if (b[0][0] == pc && b[1][0] == pc && b[2][0] == pc) {return true;} else
			if (b[0][1] == pc && b[1][1] == pc && b[2][1] == pc) {
			return true;
		} else
			if (b[0][2] == pc && b[1][2] == pc && b[2][2] == pc) {
			return true;
		} else {return false;
		}
	}

	private boolean isD(char[][] b, char pc) {
		if (b[0][0] == pc && b[1][1] == pc && b[2][2] == pc) {return true;
		} else if (b[0][2] == pc && b[1][1] == pc && b[2][0] == pc) {
			return true;
		} else {return false;
		}
	}
}
