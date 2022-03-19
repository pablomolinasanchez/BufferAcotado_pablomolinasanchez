package BufferAcotado_pablomolinasanchez;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	private int a;
	private BufferAcotado_pablomolinasanchez b;
	
	@Given ("Quiero crear un buffer con capacidad 3")
		public void quiero_Buffer(int a) {
		this.a=a;
		b=new BufferAcotado_pablomolinasanchez(this.a);
	}
	@When ("Creamos el buffer de capacidad 3")
		
	@Then ("Hemos creado el buffer")
	
	

	@Given ("Quiero añadir un <a> al buffer de tamaño 3")
	public void quiero_Añadir(int a) {
		a=3;
		this.a=a;
		b=new BufferAcotado_pablomolinasanchez(this.a);
	}
	@When ("Añadimos el <a>")
	private boolean add(int a) {
		int initialSize = b.size();
		b.put(a);
		int finalSize=initialSize+1;
		boolean result=false;
		if(finalSize==b.size()) {
			result=true;
		}
		return result;
	}
	@Then ("Hemos añadido el <a>")
	public void addGood() {
		assertEquals(true,add(a));
	}
	
	@Given ("Quiero saber si el buffer de capacidad 3 está lleno")
	public void quiero_Full(int a) {
		a=3;
		this.a=a;
		b=new BufferAcotado_pablomolinasanchez(this.a);
	}
	@When ("Salimos de dudas de si el buffer está lleno")
	private boolean full() {
		return b.isFull();
	}
	@Then ("El buffer no está lleno")
	public void fullGood() {
		assertEquals(false,full());
	}
	
	
	@Given ("Quiero saber si el buffer de capacidad 3 está vacío")
	public void quiero_Empty(int a) {
		a=3;
		this.a=a;
		b=new BufferAcotado_pablomolinasanchez(this.a);
	}
	@When ("Salimos de dudas de si el buffer está vacío")
	private boolean empty() {
		return b.isEmpty();
	}
	@Then ("El buffer no está vacío")
	public void emptyGood() {
		assertEquals(true,full());
	}
}
