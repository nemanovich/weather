package support;

public enum City {
		MOSCOW {
			public int id() {return 27612;}
			public String url() {return "moscow";}
			public String toString() {return "Москва";}			
		},
		SAINT_PETERSBURG {
			public int id() {return 26063;}
			public String url() {return "saint%20petersburg";}
			public String toString() {return "Санкт-Петербург";}			
		};

		public abstract String url();
		public abstract int id();
}
