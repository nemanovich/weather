package ru.yandex.weather.utils.data;

public enum Region {
    MOSCOW {
        public int id() {
            return 213;
        }

        public String url() {
            return "moscow";
        }

        public String toString() {
            return "Москва";
        }
    },
    SAINT_PETERSBURG {
        public int id() {
            return 2;
        }

        public String url() {
            return "saint-petersburg";
        }

        public String toString() {
            return "Санкт-Петербург";
        }
    };

    public abstract String url();

    public abstract int id();
}
