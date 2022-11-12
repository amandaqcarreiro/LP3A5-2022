import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Time {
	private String nome;
	private String cnpj;
	private int qntdTorcedores;
	
	public Field[] getDeclaredFields() throws SecurityException {
		return null;
	}
	
	public Method getDeclaredMethod(String getNome, Time[] parameterType) throws NoSuchMethodException, SecurityException {
		return null;
	}
	
	public Time() {
		System.out.println("Palmeiras nao tem mundial");
	}
	
	public Time(String nome, String cnpj, int qntdTorcedores) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.qntdTorcedores = qntdTorcedores;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getQntdTorcedores() {
		return qntdTorcedores;
	}
	public void setQntdTorcedores(int qntdTorcedores) {
		this.qntdTorcedores = qntdTorcedores;
	}
	
	
}
