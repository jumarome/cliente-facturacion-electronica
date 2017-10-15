package ec.facturacion.electronica.enumeraciones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum TipoEmisionEnum {
	/**
	 * Emisi�n normal
	 */
	@XmlEnumValue("1")
	NORMAL("1"),

	/**
	 * Emisi�n por Indisponibilidad del Sistema
	 */
	@XmlEnumValue("2")
	INDISPONIBILIDAD("2");

	private String codigo;

	private TipoEmisionEnum(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
}