import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ViewScoped;
import java.io.Serializable;
import suma.Suma;

@ManagedBean(name = "beansuma")
@ViewScoped
public class Beansuma implements Serializable {
	private static final long serialVersionUID = 1L;
	private final Suma suma;
	  public Beansuma() {
		  suma = new Suma();
	  }
	  
	
	  public Suma getSuma() {
		  return suma;
	  }
	  
}