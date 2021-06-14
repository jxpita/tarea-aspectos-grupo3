public aspect Observer {
	
	pointcut colorTurquesa() : execution(void fondoTurquesa(..) );
	after() : colorTurquesa() {
		System.out.println("Cambio de color a Turquesa");
	}

	pointcut colorCarmin() : execution(void fondoCarmin(..) );
	after() : colorCarmin() {
		System.out.println("Cambio de color a Carmín");
	}
	
	pointcut colorMorado() : execution(void fondoMorado(..) );
	after() : colorMorado() {
		System.out.println("Cambio de color a Morado");
	}
	
}
