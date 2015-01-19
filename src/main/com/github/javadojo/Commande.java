package com.github.javadojo;

public enum Commande {

	GORIGHT {
		@Override
		public void doAction() {
			// TODO Auto-generated method stub

		}

		@Override
		public String print() {
			return "-";
		}
	},
	GOLEFT {
		@Override
		public void doAction() {

		}

		@Override
		public String print() {
			return "-";
		}
	},
	GOSTRAIGHTLINE {
		@Override
		public void doAction() {

		}

		@Override
		public String print() {
			return "-";
		}
	},
	
	GONORTH {
		@Override
		public void doAction() {

		}

		@Override
		public String print() {
			return "|";
		}
	},
	
	GOSOUDTH {
		@Override
		public void doAction() {

		}

		@Override
		public String print() {
			return "|";
		}
	},
	CATCH

	{
		@Override
		public void doAction() {

		}

		@Override
		public String print() {
			return "S";
		}
	};
	public abstract void doAction();

	public abstract String print();
}
