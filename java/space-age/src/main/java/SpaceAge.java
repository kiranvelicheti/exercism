class SpaceAge {

    double seconds;

    SpaceAge(double seconds) {
	this.seconds = seconds;
    }

    double getSeconds() {
	return seconds;
    }

    double onEarth() {
	Double d = seconds / (60 * 60 * 24 * 365);
	return Math.round(d * 100.0) / 100.0;
    }

    double onMercury() {
	throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onVenus() {
	throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onMars() {
	throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onJupiter() {
	throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onSaturn() {
	throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onUranus() {
	throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onNeptune() {
	throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
