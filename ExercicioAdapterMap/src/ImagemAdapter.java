
public class ImagemAdapter implements ImagemTarget {
	
	
	Imagem img;
	
	public ImagemAdapter(){
		img = new ImagemJpeg();
	}
	
	/*
	 * OBS: tamb�m pensei na op��o de se colocar um par�metro no construtor para 
	 * passar qualquer um dos tipos de Imagem.
	 * EX:
	 * 
	 * public ImagemAdapter(Imagem img){
		this.img = img;
	}
	 *  
	 * 
	 */

	@Override
	public void carregarImagem() {
		System.out.println("Carregou imagem");
		
	}

	@Override
	public void desenharImagem() {
		img.desenhar();
		
	}

}
