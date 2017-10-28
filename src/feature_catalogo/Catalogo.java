package feature_catalogo;

	/**
	 * @author Alejandra Ahumada Castellanos - User B
	 *
	 */
	

	public class Catalogo extends javax.swing.JFrame{
		
		//ATIBUTOS
			private int codigo;
			private int cantidad;
			private int precio;
		        
		        //OVERLOADING DE CONSTRUCTORES
		        public Catalogo (int codigo, int cantidad, int precio){
		        this.codigo = codigo;
		        this.cantidad = cantidad;
		        this.precio = precio;
		        }
		           
			//GETTER Y SETTER
	

		    public int getCodigo() {
		        return codigo;
		    }
	

		    public void setCodigo(int codigo) {
		        this.codigo = codigo;
		    }
		    
		    public int getCantidad() {
		        return cantidad;
		    }
		    
		    public void setTamaño(int cantidad) {
		        this.cantidad = cantidad;
		    }
	

		    public int getPrecio() {
		        return precio;
		    }
	

		    public void setPrecio(int precio) {
		        this.precio = precio;
		    }
		        
		        public void desplegarDatos (String Quien){
		            System.out.println("Nombre del producto:"+Quien);
		            System.out.println( "Ingresar datos del producto:" );
		            System.out.println("Codigo: "+codigo);
		            System.out.println("Cantidad: "+cantidad);
		            System.out.println("Precio: "+precio);
		            System.out.println("------------------------------------");
		        }  
		
		public static void main(String[] args) {
			System.out.println("Catalogo Version 1");
			
			Catalogo Producto1 = new Catalogo (00112233, 1, 20);
			Producto1.desplegarDatos(" Pera");
		}
}
