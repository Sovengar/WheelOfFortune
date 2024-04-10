package RuletaFortuna;

import java.util.ArrayList;

/**
 * Clase "estatica" que contiene atributos estaticos lo cual valen lo mismo para
 * todas las clases. Sin embargo los valores almacenados solo pueden ser
 * alterados desde aqui. Tiene 3 metodos llamado getFrase mas la dificultad, que
 * nos generan una frase aleatoria en base a la dificultad.
 * 
 * @author Jonathan Garcia Ruiz
 */
public class Frase {

	
	/////////////////////////////////// OPCION 1 ///////////////////////////////////////////
	
	//ATRIBUTOS ESTATICOS
	private static final ArrayList <String> fraseNOVATO = new ArrayList <String>();
	private static final ArrayList <String> fraseMEDIO = new ArrayList <String>();
	private static final ArrayList <String> fraseEXPERTO = new ArrayList <String>();
	
	private static final ArrayList <String> fraseKANEKI = new ArrayList <String>();
	
	
	//FRASES
	public static void fraseNOVATO() {
		
		fraseNOVATO.add("REALMENTE PENSABA QUE YO ERA UN HUMANO BONDADOSO, PERO... FUE UN ERROR. HABIA ALGUNOS HUMANOS QUE ERAN IMPORTANTES PARA MI, PERO LA MAYORIA DE ELLOS ME TRAIAN SIN CUIDADO");//KEN KANEKI
		fraseNOVATO.add("NO IMPORTA CUANTO TRATE DE AVIVAR MI VOLUNTAD PARA PELEAR CON ODIO. MAS QUE TRISTEZA, MAS QUE RABIA, LA EMOCION QUE SURGIO DENTRO DE MI FUE.. DESESPERACION");//KEN KANEKI
		fraseNOVATO.add("SIEMPRE QUERIENDO AYUDAR A LOS CERCANOS ARRINCONANDOME A MI MISMO. COLOCANDO LAS OPCIONES EN UNA ESCALA, TODO EL TIEMPO EN DUDA");//KEN KANEKI
		fraseNOVATO.add("MIENTRAS MIS DEDOS CRECIERON COMO UÑAS UNA Y OTRA Y OTRA VEZ, CADA OCASION TENIA LA SENSACION DE QUE VERDADERAMENTE ERA UN MOUNSTRUO");//KEN KANEKI
		fraseNOVATO.add("¿POR QUE DEBERIA DISCULPARME POR SER UN MOUNSTRUO?, ¿ALGUIEN SE HA DISCULPADO CONMIGO POR CONVERTIRME EN UNO?");//JUUZOU SUYUZA
		fraseNOVATO.add("ESOS OJOS FRIOS Y PENETRANTES COMO TROZOS DE CRISTAL, SON ALGO QUE NO PUEDO OLVIDAR"); //SHUU TSUKIYAMA
		fraseNOVATO.add("¿POR QUE ES QUE LAS COSAS MAS HERMOSAS ESTAN ENTRELAZADAS MAS PROFUNDO CON LA MUERTE QUE CON LA VIDA?");//KEN KANEKI
		fraseNOVATO.add("MAMA SOLO ERA UNA PERSONA AMABLE JUSTO COMO UNA COBARDE, CON MIEDO A LA SOLEDAD JUSTO COMO YO");//KEN KANEKI
		fraseNOVATO.add("UNA MIRADA FRIA... MIRAR EL MUNDO A TRAVES DEL OTRO OJO... NO PUEDO CREERLO, MI CORAZON ESTA ARDIENDO");//KEN KANEKI
		fraseNOVATO.add("SI FUERAS A ESCRIBIR UNA HISTORIA CONMIGO DE PROTAGONISTA, SEGURAMENTE SERIA UNA TRAGEDIA");//KEN KANEKI
		fraseNOVATO.add("NO ME INTERESA TOMAR EL LUGAR DE LOS QUE NO PUEDO VER. YO PELEO POR LOS QUE SON CERCANOS A MI Y SOLO PASO QUE LA MAYORIA SON GHOULS");
		fraseNOVATO.add("PORQUE LO AMO. AMO AL INSPECTOR SASAKI Y ES QUE NO PUEDO EVITARLO. SI HAY ALGO QUE PUEDA HACER ENTONCES LO HARE, NO IMPORTA QUE"); //TOORU MUTSUKI
		fraseNOVATO.add("EN ALGUN LUGAR, A LO LARGO DEL CAMINO, POR ERROR, COMIENZO A DESEAR, UNA VEZ MAS. NO MAS SUEÑO, NO MAS VIGILIA"); //KEN KANEKI
		fraseNOVATO.add("¿QUE ES LA PAZ? YO NO LO SE. YA SEAN HUMANOS O GHOULS, SI UNO DESAPARECE, ¿HABRA PAZ?, PERSONALMENTE ME GUSTAN LAS COSAS TAL Y COMO ESTAN"); //JUUZOU SUYUZA
		fraseNOVATO.add("TU TAMBIEN ESTAS COMPLETAMENTE VACIO POR DENTRO ASI QUE SI NO TE TENEMOS ENCADENADO TE PERDERAS Y MORIRAS"); //KEN KANEKI A TAKIZAWA
		
	}
	
	
	public static void fraseMEDIO() {
		
		fraseMEDIO.add("YO NO SOY EL QUE SE EQUIVOCA. EL MUNDO ES EL QUE ESTA EQUIVOCADO");//KEN KANEKI
		fraseMEDIO.add("TRATASTE DE COMERME... NO TE IMPORTA SI TE COMO, ¿VERDAD?");//KEN KANEKI
		fraseMEDIO.add("NO.. YO NO ERA EL GHOUL QUE COMIA. EL UNICO QUE FUE COMIDO FUI YO..");//KEN KANEKI
		fraseMEDIO.add("¿PENSASTE QUE ALGO ASI ME LASTIMARIA, DESPUES DE TODO LO QUE HE PASADO?");//KEN KANEKI
		fraseMEDIO.add("CUANDO ESTAS FRENTE AL ENEMIGO, AUN SI TUS MANOS ESTAN TEMBLANDO, PELEA");//KUREO MADO
		fraseMEDIO.add("CUALQUIERA QUE ME TRATE DE QUITAR A MIS AMIGOS NO TENDRA MISERICORDIA"); //KEN KANEKI
		fraseMEDIO.add("MIRAR A LOS GHOULS IMITAR LA CONDUCTA HUMANA DE VERDAD ME ENFERMA"); //KUREO MADO
		fraseMEDIO.add("NO ME ECHARE PARA ATRAS. IRE HACIA ADELANTE, COMO UN CIEMPIES"); //KEN KANEKI
		fraseMEDIO.add("YO NO QUERIA PROTEGER A TODOS. LO QUE QUERIA ERA... A MI MISMO");//KEN KANEKI
		fraseMEDIO.add("¿POR QUE ESTOY VIENDO BELLEZA EN LA MUERTE EN VEZ DE LA VIDA?");//KEN KANEKI
		fraseMEDIO.add("UNA PERSONA QUE TRATO DE SENTIRSE MEJOR CULPANDO A OTROS, ESE FUI YO"); //RENJI YOMO
		fraseMEDIO.add("SI EL VACIO ES SOLO OTRA EMOCION, ENTONCES ESO TAMBIEN EXISTE"); //KOUTAROU AMON
		fraseMEDIO.add("SOLO ES UNA CADENA PEQUEÑA... Y AUN ASI SE SIENTE MUY PESADA PARA MI"); //SEIDOU TAKIZAWA
		
	}
	
	
	public static void fraseEXPERTO() {
		
		fraseEXPERTO.add("SOMOS TAN FEOS..");//KEN KANEKI
		fraseEXPERTO.add("YO CREI QUE ERAS LINDA"); //KEN KANEKI
		fraseEXPERTO.add("EN UN MAR DE SANGRE Y ENTRAÑAS");//TOUKA
		fraseEXPERTO.add("JUNTOS HASTA EL FIN DEL MUNDO... GLORREICH"); //KANAE VON ROSEWALD
		fraseEXPERTO.add("AL FINAL, MAMA Y YO NO SOMOS DIFERENTES -KEN KANEKI");//KEN KANEKI
		fraseEXPERTO.add("AUN SI MORIMOS O NO REALMENTE NO IMPORTA"); //JUUZOU SUYUZA
		fraseEXPERTO.add("MI SALVACION ES.. SIMPLEMENTE TENER UN SUEÑO FELIZ");//KEN KANEKI
		fraseEXPERTO.add("¡TE LO SUPLICO! ¡NO ME CONVIERTAS EN UN ASESINO!");//KEN KANEKI
		fraseEXPERTO.add("NO PUEDO VIVIR CONTIGO PERO TAMPOCO PUEDO SIN TI");//UTA
		fraseEXPERTO.add("EL DOLOR ES TU AMIGO, ES TU ALIADO");//KEN KANEKI
		fraseEXPERTO.add("ESTOY CANSADO DE NO PODER HACER NADA"); //KEN KANEKI
		fraseEXPERTO.add("ES TU CAMINO, INTENTA CAMINARLO SOLO"); //RENJI YOMO
		fraseEXPERTO.add("INTENTE SER NORMAL UNA VEZ Y FUE ABURRIDO"); //JUUZO SUYUZA
		fraseEXPERTO.add("UN MESTIZO COMO TU NO TIENE LUGAR EN ESTE MUNDO"); //KIRISHIMA TOUKA
		fraseEXPERTO.add("INCLUSO LA VIDA PUEDE NACER DEL CAOS INFINITO"); //KICHIMURA WASHUU
		fraseEXPERTO.add("MI SALVACION ES.. SIMPLEMENTE TENER UN SUEÑO FELIZ..");//KEN KANEKI	
		fraseEXPERTO.add("SI FUERAS A MORIR TOUKA, SE ME ROMPERIA EL CORAZON"); //KEN KANEKI
		fraseEXPERTO.add("LA UNICA PERSONA QUE REALMENTE ODIAS ES TU PADRE"); //DONATO PORPORA
		fraseEXPERTO.add("¿ESTOY VIVIENDO SOLO PARA VER LA MUERTE?"); //KEN KANEKI
		fraseEXPERTO.add("QUIERO VIVIR, VIVIR Y PROTEGERLA"); //KEN KANEKI
		fraseEXPERTO.add("¿QUIERES MORIR OTRA VEZ?"); //KISHOU ARIMA
		
	}
	
	
	
	
	
	
/*	
	public static void fraseKANEKI() {
		
		fraseKANEKI.add("REALMENTE PENSABA QUE YO ERA UN HUMANO BONDADOSO, PERO... FUE UN ERROR. HABIA ALGUNOS HUMANOS QUE ERAN IMPORTANTES PARA MI, PERO LA MAYORIA DE ELLOS ME TRAIAN SIN CUIDADO");//KEN KANEKI
		fraseKANEKI.add("NO IMPORTA CUANTO TRATE DE AVIVAR MI VOLUNTAD PARA PELEAR CON ODIO. MAS QUE TRISTEZA, MAS QUE RABIA, LA EMOCION QUE SURGIO DENTRO DE MI FUE.. DESESPERACION");//KEN KANEKI
		fraseKANEKI.add("SIEMPRE QUERIENDO AYUDAR A LOS CERCANOS ARRINCONANDOME A MI MISMO. COLOCANDO LAS OPCIONES EN UNA ESCALA, TO DO EL TIEMPO EN DUDA");//KEN KANEKI
		fraseKANEKI.add("MIENTRAS MIS DEDOS CRECIERON COMO UÑAS UNA Y OTRA Y OTRA VEZ, CADA OCASION TENIA LA SENSACION DE QUE VERDADERAMENTE ERA UN MOUNSTRUO");//KEN KANEKI
		fraseKANEKI.add("¿POR QUE ES QUE LAS COSAS MAS HERMOSAS ESTAN ENTRELAZADAS MAS PROFUNDO CON LA MUERTE QUE CON LA VIDA?");//KEN KANEKI
		fraseKANEKI.add("MAMA SOLO ERA UNA PERSONA AMABLE JUSTO COMO UNA COBARDE, CON MIEDO A LA SOLEDAD JUSTO COMO YO");//KEN KANEKI
		fraseKANEKI.add("UNA MIRADA FRIA... MIRAR EL MUNDO A TRAVES DEL OTRO OJO... NO PUEDO CREERLO, MI CORAZON ESTA ARDIENDO");//KEN KANEKI
		fraseKANEKI.add("SI FUERAS A ESCRIBIR UNA HISTORIA CONMIGO DE PROTAGONISTA, SEGURAMENTE SERIA UNA TRAGEDIA");//KEN KANEKI
		fraseKANEKI.add("NO ME INTERESA TOMAR EL LUGAR DE LOS QUE NO PUEDO VER. YO PELEO POR LOS QUE SON CERCANOS A MI Y SOLO PASO QUE LA MAYORIA SON GHOULS");
		fraseKANEKI.add("EN ALGUN LUGAR, A LO LARGO DEL CAMINO, POR ERROR, COMIENZO A DESEAR, UNA VEZ MAS. NO MAS SUEÑO, NO MAS VIGILIA"); //KEN KANEKI
		fraseKANEKI.add("TU TAMBIEN ESTAS COMPLETAMENTE VACIO POR DENTRO ASI QUE SI NO TE TENEMOS ENCADENADO TE PERDERAS Y MORIRAS"); //KEN KANEKI A TAKIZAWA
		
	}
	
	
	public static String getFraseKANEKI() {

		fraseKANEKI();
		
		for(int i=0; i<fraseKANEKI.size(); i++) 
		return fraseKANEKI.get(i);
		
		//return fraseKANEKI.get(i);
	}
	*/
	
	
	
	/////// METODOS GETTERS DE LOS ATRIBUTOS ESTATICOS

	public static String getFraseNOVATO() {

		fraseNOVATO();
		int i;
		i = (int) (Math.random() * fraseNOVATO.size());
		return fraseNOVATO.get(i);

	}


	public static String getFraseMEDIO() {

		fraseMEDIO();
		int i;
		i = (int) (Math.random() * fraseMEDIO.size());
		return fraseMEDIO.get(i);
	}

	
	public static String getFraseEXPERTO() {

		fraseEXPERTO();
		int i;
		i = (int) (Math.random() * fraseEXPERTO.size());
		return fraseEXPERTO.get(i);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/////////////////////////////////// OPCION 2 ///////////////////////////////////////////
	
	private static String[] fraseNOVATO2 = {

			"REALMENTE PENSABA QUE YO ERA UN HUMANO BONDADOSO, PERO... FUE UN ERROR. HABIA ALGUNOS HUMANOS QUE ERAN IMPORTANTES PARA MI, PERO LA MAYORIA DE ELLOS ME TRAIAN SIN CUIDADO", // KEN
																																															// KANEKI
			"NO IMPORTA CUANTO TRATE DE AVIVAR MI VOLUNTAD PARA PELEAR CON ODIO. MAS QUE TRISTEZA, MAS QUE RABIA, LA EMOCION QUE SURGIO DENTRO DE MI FUE.. DESESPERACION", // KEN
																																											// KANEKI
			"SIEMPRE QUERIENDO AYUDAR A LOS CERCANOS ARRINCONANDOME A MI MISMO. COLOCANDO LAS OPCIONES EN UNA ESCALA, TODO EL TIEMPO EN DUDA", // KEN
																																				// KANEKI
			"MIENTRAS MIS DEDOS CRECIERON COMO UÑAS UNA Y OTRA Y OTRA VEZ, CADA OCASION TENIA LA SENSACION DE QUE VERDADERAMENTE ERA UN MOUNSTRUO", // KEN
																																					// KANEKI
			"¿POR QUE DEBERIA DISCULPARME POR SER UN MOUNSTRUO?, ¿ALGUIEN SE HA DISCULPADO CONMIGO POR CONVERTIRME EN UNO?", // JUUZOU
																																// SUYUZA
			"ESOS OJOS FRIOS Y PENETRANTES OJOS COMO TROZOS DE CRISTAL TUYOS, SON ALGO QUE NO PUEDO OLVIDAR", // SHUU
																												// TSUKIYAMA
			"¿POR QUE ES QUE LAS COSAS MAS HERMOSAS ESTAN ENTRELAZADAS MAS PROFUNDO CON LA MUERTE QUE CON LA VIDA?", // KEN
																														// KANEKI
			"MAMA SOLO ERA UNA PERSONA AMABLE JUSTO COMO UNA COBARDE, CON MIEDO A LA SOLEDAD JUSTO COMO YO", // KEN
																												// KANEKI
			"UNA MIRADA FRIA... MIRAR EL MUNDO A TRAVES DEL OTRO OJO... NO PUEDO CREERLO, MI CORAZON ESTA ARDIENDO", // KEN
																														// KANEKI
			"SI FUERAS A ESCRIBIR UNA HISTORIA CONMIGO DE PROTAGONISTA, SEGURAMENTE SERIA UNA TRAGEDIA", // KEN KANEKI
			"NO ME INTERESA TOMAR EL LUGAR DE LOS QUE NO PUEDO VER. YO PELEO POR LOS QUE SON CERCANOS A MI Y SOLO PASO QUE LA MAYORIA SON GHOULS",
			"PORQUE LO AMO. AMO AL INSPECTOR SASAKI Y ES QUE NO PUEDO EVITARLO. SI HAY ALGO QUE PUEDA HACER ENTONCES LO HARE, NO IMPORTA QUE", // TOORU
																																				// MUTSUKI
			"EN ALGUN LUGAR, A LO LARGO DEL CAMINO, POR ERROR, COMIENZO A DESEAR, UNA VEZ MAS. NO MAS SUEÑO, NO MAS VIGILIA", // KEN
																																// KANEKI
			"¿QUE ES LA PAZ? YO NO LO SE. YA SEAN HUMANOS O GHOULS, SI UNO DESAPARECE, ¿HABRA PAZ?, PERSONALMENTE ME GUSTAN LAS COSAS TAL Y COMO ESTAN", // JUUZOU
																																							// SUYUZA
			"TU TAMBIEN ESTAS COMPLETAMENTE VACIO POR DENTRO ASI QUE SI NO TE TENEMOS ENCADENADO TE PERDERAS Y MORIRAS", // KEN
																															// KANEKI
																															// A
																															// TAKIZAWA

	};

	private static final String[] fraseMEDIO2 = {

			"YO NO SOY EL QUE SE EQUIVOCA. EL MUNDO ES EL QUE ESTA EQUIVOCADO", // KEN KANEKI
			"TRATASTE DE COMERME... NO TE IMPORTA SI TE COMO, ¿VERDAD?", // KEN KANEKI
			"NO.. YO NO ERA EL GHOUL QUE COMIA. EL UNICO QUE FUE COMIDO FUI YO..", // KEN KANEKI
			"¿PENSASTE QUE ALGO ASI ME LASTIMARIA, DESPUES DE TODO LO QUE HE PASADO?", // KEN KANEKI
			"CUANDO ESTAS FRENTE AL ENEMIGO, AUN SI TUS MANOS ESTAN TEMBLANDO, PELEA", // KUREO MADO
			"CUALQUIERA QUE ME TRATE DE QUITAR A MIS AMIGOS NO TENDRA MISERICORDIA", // KEN KANEKI
			"MIRAR A LOS GHOULS IMITAR LA CONDUCTA HUMANA DE VERDAD ME ENFERMA", // KUREO MADO
			"NO ME ECHARE PARA ATRAS. IRE HACIA ADELANTE, COMO UN CIEMPIES", // KEN KANEKI
			"YO NO QUERIA PROTEGER A TODOS. LO QUE QUERIA ERA... A MI MISMO", // KEN KANEKI
			"¿POR QUE ESTOY VIENDO BELLEZA EN LA MUERTE EN VEZ DE LA VIDA?", // KEN KANEKI
			"UNA PERSONA QUE TRATO DE SENTIRSE MEJOR CULPANDO A OTROS, ESE FUI YO", // RENJI YOMO
			"SI EL VACIO ES SOLO OTRA EMOCION, ENTONCES ESO TAMBIEN EXISTE", // KOUTAROU AMON
			"SOLO ES UNA CADENA PEQUEÑA... Y AUN ASI SE SIENTE MUY PESADA PARA MI", // SEIDOU TAKIZAWA

	};

	private static final String[] fraseEXPERTO2 = {

			"SOMOS TAN FEOS..", // KEN KANEKI
			"YO CREI QUE ERAS LINDA", // KEN KANEKI
			"EN UN MAR DE SANGRE Y ENTRAÑAS", // TOUKA
			"JUNTOS HASTA EL FIN DEL MUNDO... GLORREICH", // KANAE VON ROSEWALD
			"AL FINAL, MAMA Y YO NO SOMOS DIFERENTES -KEN KANEKI", // KEN KANEKI
			"AUN SI MORIMOS O NO REALMENTE NO IMPORTA", // JUUZOU SUYUZA
			"MI SALVACION ES.. SIMPLEMENTE TENER UN SUEÑO FELIZ", // KEN KANEKI
			"¡TE LO SUPLICO! ¡NO ME CONVIERTAS EN UN ASESINO!", // KEN KANEKI
			"NO PUEDO VIVIR CONTIGO PERO TAMPOCO PUEDO SIN TI", // UTA
			"EL DOLOR ES TU AMIGO, ES TU ALIADO", // KEN KANEKI
			"ESTOY CANSADO DE NO PODER HACER NADA", // KEN KANEKI
			"ES TU CAMINO, INTENTA CAMINARLO SOLO", // RENJI YOMO
			"INTENTE SER NORMAL UNA VEZ Y FUE ABURRIDO", // JUUZO SUYUZA
			"UN MESTIZO COMO TU NO TIENE LUGAR EN ESTE MUNDO", // KIRISHIMA TOUKA
			"INCLUSO LA VIDA PUEDE NACER DEL CAOS INFINITO", // KICHIMURA WASHUU
			"MI SALVACION ES.. SIMPLEMENTE TENER UN SUEÑO FELIZ..", // KEN KANEKI
			"SI FUERAS A MORIR TOUKA, SE ME ROMPERIA EL CORAZON", // KEN KANEKI
			"LA UNICA PERSONA QUE REALMENTE ODIAS ES TU PADRE", // DONATO PORPORA
			"¿ESTOY VIVIENDO SOLO PARA VER LA MUERTE?", // KEN KANEKI
			"QUIERO VIVIR, VIVIR Y PROTEGERLA", // KEN KANEKI
			"¿QUIERES MORIR OTRA VEZ?", // KISHOU ARIMA

	};

	
	
	/////// METODOS GETTERS DE LOS ATRIBUTOS ESTATICOS
	 
	
	 /** METODO ESTATICO QUE ME PROPORCIONA UNA FRASE ALEATORIA SEGUN LA
	 * DIFICULTAD
	 * 
	 * @return frase facil
	 */
	 public static String getFraseNOVATO2() {

	 int i;
	 i = (int) (Math.random() * fraseNOVATO2.length);
	 return fraseNOVATO2[i];
	 }


	/**
	 * METODO ESTATICO QUE ME PROPORCIONA UNA FRASE ALEATORIA SEGUN LA DIFICULTAD
	 * 
	 * @return frase medio
	 */
	public static String getFraseMEDIO2() {

	int i;
	i = (int) (Math.random() * fraseMEDIO2.length);
	return fraseMEDIO2[i];
	 }


	/**
	 * METODO ESTATICO QUE ME PROPORCIONA UNA FRASE ALEATORIA SEGUN LA DIFICULTAD
	 * 
	 * @return frase experto
	 */
	public static String getFraseEXPERTO2() {

	 int i;
	i = (int) (Math.random() * fraseEXPERTO2.length);
	return fraseEXPERTO2[i];
	}



}