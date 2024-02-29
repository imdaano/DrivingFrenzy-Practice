package drivingFrenzy.race;

public class Track {
	private final Section[] sections;

	public String getDescription() {
		String result = "Este circuito se compone de " + sections.length + " secciones. ";
		// We could have the length and speeds pre-computed when creating the track.
		int length = 0;
		int fastestSectionSpeed = 0; // velocidad maxima de secci�n
		int slowestSectionSpeed = Integer.MAX_VALUE; //
		for (Section section : sections) {
			length = length + section.getLength(); // va sumando el total de metros a las secciones
			if (fastestSectionSpeed < section.getTheoreticalMaxSpeed()) {
				fastestSectionSpeed = section.getTheoreticalMaxSpeed(); // este if calcula sirve para calcular cual es la velocidad maxima de cada secci�n para obtener
				// la velocidad de la seccion mas r�pida
			}
			if (slowestSectionSpeed > section.getTheoreticalMaxSpeed()) {
				slowestSectionSpeed = section.getTheoreticalMaxSpeed(); // sirve para calcular la seccion mas lenta
			}
		}
		// Imprimir info sobre el tramo m�s r�pido y el m�s lento.
		// Imprimir la info en kil�metros.
		result += "La longitud total es de "+  length + " metros. En el tramo m�s r�pido se alcanza la friolera de " + fastestSectionSpeed
				+ " km/h, mientras que en el tramo m�s lento los pilotos han de reducir a " + slowestSectionSpeed
				+ " km/h";
		return result;
	}

	public Track(Section[] sections) {
		super();
		this.sections = sections;
	}

	public Section[] getSections() {
		return sections;
	}

}
