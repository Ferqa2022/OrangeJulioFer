package OrangeJulio.Definitions;

import org.openqa.selenium.WebDriver;

import OrangeJulio.Paginas.LoginPage;
import OrangeJulio.Paginas.PimPage;
import OrangeJulio.Steps.Conexion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage (driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	
	@And("^diligenciar usuario (.*) y password (.*)$")
	public void ingresarLogin(String userName, String pass) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.ingresarLogin(userName, pass);
		
	}
	
	@And("^llegar a la opcion agregar empleado$")
	public void llegarAddEmployee(){
		this.pimPage = new PimPage(driver);
		this.pimPage.llegarAddEmployee();
		
		
	}

}