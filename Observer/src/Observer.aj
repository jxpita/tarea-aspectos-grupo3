public aspect Observer {
	
	pointcut cambioDeColor() : execution(void fondoTurquesa(..) );
	after() : cambioDeColor() {
		System.out.println("Cambio de color a Turquesa\n");
	}

	pointcut colorCarmin() : execution(void fondoCarmin(..) );
	after() : colorCarmin() {
		System.out.println("Cambio de color a Carmín\n");
	}
	
	pointcut colorMorado() : execution(void fondoMorado(..) );
	after() : colorMorado() {
		System.out.println("Cambio de color a Morado\n");
	}
	
}
