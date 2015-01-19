package com.github.javadojo;

public enum Direction {

	NORTH {
		@Override
		public String print() {
			return "|";
		}
	},
	SOUD {
		@Override
		public String print() {
			return "|";
		}
	},
	EST {
		@Override
		public String print() {
			return "-";
		}
	},
	WEST

	{
		@Override
		public String print() {
			return "-";
		}

	};
	public abstract String print();
}
