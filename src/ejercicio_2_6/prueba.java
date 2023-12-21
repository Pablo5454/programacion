package ejercicio_2_6;

import java.util.Objects;

public class prueba {
	String Nombre;

	@Override
	public int hashCode() {
		return Objects.hash(Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		prueba other = (prueba) obj;
		return Objects.equals(Nombre, other.Nombre);
	}
	
}
