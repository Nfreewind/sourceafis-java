package com.machinezoo.sourceafis;

class MutableMinutia {
	IntPoint position;
	double direction;
	MinutiaType type;
	MutableMinutia() {
	}
	MutableMinutia(IntPoint position, double direction, MinutiaType type) {
		this.position = position;
		this.direction = direction;
		this.type = type;
	}
}
