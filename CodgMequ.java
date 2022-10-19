package Projet;

import java.util.Scanner;

public class CodgMequ {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
	
		System.out.println("Deseja ver o Site digite 1");
		System.out.println("Deseja sair digite 2");
		int n = ler.nextInt();
		
		if (n==1) {
			

		System.out.println("Bem vindo ao site do Mequi!!!");
		System.out.println();
		System.out.println("Bateu aquela #Fome de Méqui");
		System.out.println();
		System.out.println("Todo dia um sanduíche diferente.");
		System.out.println();
		

		System.out.println("1 - Cardápio");
		System.out.println("2 - Lançamentos");
		System.out.println("3 - Quem Somos");
		System.out.println("4 - Família");
		System.out.println("5 - Promoções");
		System.out.println("6 - Mequi pra você");
		System.out.println("7 - McDia Feliz");
		System.out.println("0 - Sair do Site");
		System.out.println();
		System.out.println("Selecione a sua opção :");
		System.out.println();
		int opcao1 = ler.nextInt();

		switch (opcao1) {
		
		case 0: 
			
			System.out.println("Fim da aplicação");
		
        	break;
        	
		case 1:
			System.out.println();
			System.out.println("Bem vindo ao cardapio, por favor selecione um pedido para mais informações.");
			System.out.println();
			System.out.println("1 - Lançamentos");
			System.out.println("2 - Sanduíches Premium");
			System.out.println("3 - Sanduíches de Carne Bovina");
			System.out.println("4 - Família Tasty");
			System.out.println("5 - Sanduíches de Frango");
			System.out.println("6 - Seleções do Mequi");
			System.out.println("7 - McLanche Feliz");
			System.out.println("8 - Mequi1000");
			System.out.println("9 - Acompanhamentos");
			System.out.println("10 - Sobremesas");
			System.out.println("11 - Bebidas Frias");
			System.out.println("12 - Café da Manhã");
			System.out.println("13 - Bebidas Quentes");
			System.out.println("14 - McOfertas");
			System.out.println("15 - Méqui Box");
			
        	
			int Cardap = ler.nextInt();

			switch (Cardap) {
			
			case 1:
				
				System.out.println("1 - McBrasil");
				System.out.println("2 - McFlurry Brasil");
				System.out.println("3 - McEspanha");
				System.out.println("4 - McArgentina");
				System.out.println("5 - McAlemanha");
				System.out.println("6 - McMéxico");
				System.out.println("7 - McFrança");
				System.out.println("8 - McEUA");
				System.out.println("9 - McCatar");
				System.out.println("10 - McFlurry Espetáculo Kopenhagen Morango");
				System.out.println("11 - McFlurry Espetáculo Kopenhagen Chocolate");
				System.out.println("12 - McFlurry Espetáculo Kopenhagen Caramelo");
				System.out.println("13 - Blister CBO");
				System.out.println("14 - Blister Tasty");
				
				int lançcar = ler.nextInt();
				switch (lançcar) {
				case 1:
					
					System.out.println("Nosso grandioso e inigualável McBrasil, composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho temperado, empanado de queijo, alface, tomate e bacon.");
					
					break;
				case 2:
					
					System.out.println("Para compor a Seleção do Méqui trouxemos a sobremesa que tem a cara do Brasil, composta por massa gelada de baunilha, calda de banana com um toque de canela, cobertura de caramelo e farofa crocante de amendoim. Você precisa experimentar!");
					
					break;
				case 3:
					
					System.out.println("O maravilhoso McEspanha, mais um craque da Seleções do Méqui, é composto por pão tipo brioche, um hamburguer (carne 100% bovina), copa fatiada, molho temperado, alface e queijo sabor emental.");
					
					break;
				case 4:
					
					System.out.println("Para compor a Seleção do Méqui trouxemos o maravilhoso McArgentina, composto por pão tipo brioche, um hamburguer (carne 100% bovina), maionese sabor chimichurri, cebola fresca, alface, tomate, bacon, e queijo sabor cheddar.");
					
					break;
				case 5:
					
					System.out.println("O novo McAlemanha, parte da Seleções do Méqui, é composto por pão tipo brioche, um hamburguer (carne 100% bovina), salame com borda de pimenta, maionese, mostarda, cebola fresca e queijo sabor emental.");
					
					break;
				case 6:
					
					System.out.println("O McMéxico, parte da Seleções do Méqui, é especialmente composto por pão tipo brioche com batata, peito de frango temperado empanado, a nova maionese sabor pimenta jalapeño, alface e queijo sabor cheddar.");
					
					break;
				case 7:
					
					System.out.println("Para compor a Seleção do Méqui trouxemos o incrível McFrança, composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho sabor queijo brie, cebola crispy, tomate, bacon e queijo sabor emental.");
					
					break;
				case 8:
					
					System.out.println("McEUA, parte da Seleções do Méqui, é composto por pão tipo brioche com batata, peito de frango temperado empanado, molho barbecue, cebola crispy, bacon, picles crinkle e queijo sabor cheddar.");
					
					break;
				case 9:
					
					System.out.println("O incrível McCatar é composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho árabe, cebola crispy, tomate e queijo sabor emental.");
					
					break;
				case 10:
					
					System.out.println("A massa geladinha de baunilha, cobertura de morango e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
					
					break;
				case 11:
					
					System.out.println("A massa geladinha de baunilha, cobertura sabor chocolate e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
					
					break;
				case 12:
					
					System.out.println("A massa geladinha de baunilha, cobertura de caramelo e o delicioso tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ao leite Kopenhagen têm.");
					
					break;
				case 13:
					
					System.out.println("O Molho do CBO complementa um dos nossos produtos mais amados pelo público, ele é composto por especiarias e possui sabor e cremosidade icônicos.");
					
					break;
				case 14:
					
					System.out.println("Único por seu sabor defumado, cremosidade e textura. O Molho Tasty é exclusivo McDonald´s");
					
					break;
					
				}
				
				
				break;
			case 2:
				
				System.out.println("McClub Sanduíche composto por pão tipo brioche, bacon crispy, molho especial, carne 100% bovina, queijo sabor emental, tomate e alface. ");
				
				break;
			case 3:
				
				System.out.println("Big Mac");
				System.out.println("Duplo Quarterão");
				System.out.println("Quarterão com Queijo");
				System.out.println("McNífico Bacon");
				System.out.println("Duplo Cheddar McMelt");
				System.out.println("Cheddar McMelt");
				System.out.println("Duplo Burger Bacon");
				System.out.println("Duplo Burguer com Queijo");
				System.out.println("Triplo Cheeseburger");
				System.out.println("McFiesta");
				System.out.println("Cheeseburger");
				System.out.println("Hamburger");
				
				int lanches = ler.nextInt();
				
				switch (lanches) {
				
				case 1:
					
					System.out.println("Dois hambúrgueres (100% carne bovina), alface americana, queijo sabor cheddar, molho especial, cebola, picles e pão com gergelim.");
					break;
					
				case 2:
					
					System.out.println("Dois hambúrgueres (100% carne bovina), mostarda, ketchup, cebola, queijo sabor cheddar e pão com gergelim.");
					break;
					
				case 3:
					
					System.out.println("Um hambúrguer (100% carne bovina), queijo sabor cheddar, picles, cebola, ketchup, mostarda e pão com gergelim.");
					break;
					
				case 4:
					
					System.out.println("Um hambúrguer (100% carne bovina), bacon, alface americana, cebola, queijo sabor cheddar, tomate, maionese, ketchup, mostarda e pão com gergelim.");
					break;
					
				case 5:
					
					System.out.println("Dois hambúrgueres (100% carne bovina), molho sabor cheddar, cebola ao molho shoyu e pão escuro com gergelim.");
					break;
					
				case 6:
					
					System.out.println("Um hambúrguer (100% carne bovina), molho sabor cheddar, cebola ao molho shoyu e pão escuro com gergelim.");
					break;
					
				case 7:
					
					System.out.println("Dois hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola, fatias de bacon, ketchup, mostarda e pão com gergelim.");
					break;
					
				case 8:
					
					System.out.println("Dois hambúrgueres, uma explosão de sabor. Dois deliciosos hambúrgueres de carne 100% bovina, queijo sabor cheddar derretido, picles, cebola picada, ketchup, mostarda e pão com gergelim.");
					break;
					
				case 9:
					
					System.out.println("Três hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão com gergelim.");
					break;
					
				case 10:
					
					System.out.println("Hambúrguer de carne 100% bovina, alface, tomate e maionese no pão quentinho.");
					break;
					
				case 11:
					
					System.out.println("Um hamburguer (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão sem gergelim.");
					break;
					
				case 12:
					
					System.out.println("Um Hamburguer (100% carne bovina), cebola, picles, ketchup, mostarda e pão sem gergelim.");
					break;
					
				
				}
				
				break;
			case 4:
				
				System.out.println("1 - Big Tasty");
				System.out.println("2 - Big Tasty turbo bacon");
				
				int tasty = ler.nextInt();
				
				switch (tasty) {
				
				case 1:
					
					System.out.println("Um hambúrguer (100% carne bovina), queijo sabor emental, tomate, alface americana, cebola, molho Tasty e pão com gergelim.");
					
				break;
				
				case 2:
					
					System.out.println("Um Hambúrguer (100% carne bovina), bacon em fatias, bacon crispy, queijo sabor emental, tomate, alface americana, cebola, molho Tasty e pão com gergelim.");
					
				break;	
				
				}
				
				break;
			case 5:
				
				System.out.println("1 - McCrispy Chicken Deluxe");
				System.out.println("2 - McCrispy Chicken Classic");
				System.out.println("3 - McCrispy Chicken Spicy");
				System.out.println("4 - McChicken Bacon");
				System.out.println("5 - McChicken");
				System.out.println("6 - Chicken Jr");
				
			int	frango = ler.nextInt();
			
			switch (frango) {
			
			case 1:
				
				System.out.println("Sanduiche composto por tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, maionese, alface americana e tomate.");
				
				break;
			case 2:
				
				System.out.println("Sanduiche composto por pão tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, manteiga e picles crinkle.");
				
				break;
			case 3:
				
				System.out.println("Sanduiche composto por tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, molho de pimenta e picles crinkle.");
				
				break;
			case 4:
				
				System.out.println("Frango empanado, maionese, bacon, alface americana e pão com gergelim.");
				
				break;
			case 5:
				
				System.out.println("Frango empanado, maionese, alface americana e pão com gergelim.");
				
				break;
			case 6:
				
				System.out.println("Frango empanado, maionese, alface americana e pão com gergelim.");
				
				break;
			
			}
				
				break;
			case 6:
				
				System.out.println("1 - McBrasil");
				System.out.println("2 - McFlurry Brasil");
				System.out.println("3 - McEspanha");
				System.out.println("4 - McArgentina");
				System.out.println("5 - McAlemanha");
				System.out.println("6 - McMéxico");
				System.out.println("7 - McFrança");
				System.out.println("8 - McEUA");
				System.out.println("9 - McCatar");
				
				int Copa = ler.nextInt();
				switch (Copa) {
				case 1:
					
					System.out.println("Nosso grandioso e inigualável McBrasil, composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho temperado, empanado de queijo, alface, tomate e bacon.");
					
					break;
				case 2:
					
					System.out.println("Para compor a Seleção do Méqui trouxemos a sobremesa que tem a cara do Brasil, composta por massa gelada de baunilha, calda de banana com um toque de canela, cobertura de caramelo e farofa crocante de amendoim. Você precisa experimentar!");
					
					break;
				case 3:
					
					System.out.println("O maravilhoso McEspanha, mais um craque da Seleções do Méqui, é composto por pão tipo brioche, um hamburguer (carne 100% bovina), copa fatiada, molho temperado, alface e queijo sabor emental.");
					
					break;
				case 4:
					
					System.out.println("Para compor a Seleção do Méqui trouxemos o maravilhoso McArgentina, composto por pão tipo brioche, um hamburguer (carne 100% bovina), maionese sabor chimichurri, cebola fresca, alface, tomate, bacon, e queijo sabor cheddar.");
					
					break;
				case 5:
					
					System.out.println("O novo McAlemanha, parte da Seleções do Méqui, é composto por pão tipo brioche, um hamburguer (carne 100% bovina), salame com borda de pimenta, maionese, mostarda, cebola fresca e queijo sabor emental.");
					
					break;
				case 6:
					
					System.out.println("O McMéxico, parte da Seleções do Méqui, é especialmente composto por pão tipo brioche com batata, peito de frango temperado empanado, a nova maionese sabor pimenta jalapeño, alface e queijo sabor cheddar.");
					
					break;
				case 7:
					
					System.out.println("Para compor a Seleção do Méqui trouxemos o incrível McFrança, composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho sabor queijo brie, cebola crispy, tomate, bacon e queijo sabor emental.");
					
					break;
				case 8:
					
					System.out.println("McEUA, parte da Seleções do Méqui, é composto por pão tipo brioche com batata, peito de frango temperado empanado, molho barbecue, cebola crispy, bacon, picles crinkle e queijo sabor cheddar.");
					
					break;
				case 9:
					
					System.out.println("O incrível McCatar é composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho árabe, cebola crispy, tomate e queijo sabor emental.");
					
					break;
				}
				
				
				
				break;
			case 7:
				
				System.out.println("McLanche Feliz - Hamburguer, batata, bebida, danoninho ou salada e brinquedo");
				
				break;
			case 8:
				
				System.out.println("1 - SuperMc");
				System.out.println("2 - McRings Cheddar Bacon");
				System.out.println("3 - Caldo&Freddo Chocolate");
				System.out.println("4 - Caldo&Freddo Morango");
				System.out.println("5 - Caldo&Freddo Caramelo");
				System.out.println("6 - McRings Bacon");
				
				int mequi1000 = ler.nextInt();
				
				switch (mequi1000) {
				
				case 1:
					
					System.out.println("Um hamburguer (100% bovino), alface americana, cebola, ketchup, molho tasty, maionese, picles, queijo sabor cheddar, tomate e pão com gergelim");
					
					break;
				case 2:
					
					System.out.println("A crocante e deliciosa cebola empanada do Méqui, agora com melt sabor cheddar e bacon crispy. Não dá para resistir, experimente! Produto exclusivo da loja Méqui 1000 (Avenida Paulista, 1811 –São Paulo - SP).");
					
					break;
				case 3:
					
					System.out.println("Sobremesa composta por mix de baunilha, cobertura sabor chocolate e torta de maçã.");
					
					break;
				case 4:
					
					System.out.println("Sobremesa composta por mix de baunilha, cobertura de morango e torta de maçã.");
					
					break;
				case 5:
					
					System.out.println("Sobremesa composta por mix de baunilha, cobertura de caramelo e torta de maçã.");
					
					break;
				case 6:
					
					System.out.println("Esse delicioso sanduiche é composto por um hambúrguer (100% carne bovina), queijo sabor emental, bacon, cebola frita empanada, maionese, ketchup e pão tipo brioche. Produto exclusivo da loja Méqui 1000 (Avenida Paulista, 1811 –São Paulo -SP.)");
					
					break;
				
				}
				
				break;
			case 9:
				
				System.out.println("1 - Fritas");
				System.out.println("2 - Nuggets");
				System.out.println("3 - Molhos");
				
				int acon = ler.nextInt();
				switch(acon) {
				
				case 1:
					
					System.out.println("Fritas com bacon e cheddar, fritas grandes, médias, pequenas, kids e mega");
					
					break;
				case 2:
					
					System.out.println("Chicken nuggets 6, 4, 10 unidades e balde de nuggets");
					
					break;
				case 3:

					System.out.println("Blister Tasty e CBO, ketchup, mostarda, molho caipira, ranch, barbecue e agridoce");
					
					break;
				
				}
				
				break;
			case 10:
				
				System.out.println("1 - Casquinha");
				System.out.println("2 - Sundae");
				System.out.println("3 - Top Sundae");
				System.out.println("4 - McColosso");
				System.out.println("5 - Danoninho");
				System.out.println("6 - Torta");
				System.out.println("7 - McShake");
				System.out.println("8 - McFlurry");
				
				int sorv = ler.nextInt();
				
				switch (sorv) {
				
				case 1:
					
					System.out.println("A sobremesa que o Brasil todo adora. Uma casquinha supercrocante, com massa gelada de chocolate, baunilha e mista que vai bem a qualquer hora.");
					
					break;
				
                   case 2:
                	   
                	   System.out.println("A medida certa entre cobertura de morango, chocolate e caramelo e massa gelada de baunilha que pode fazer você viver uma experiência explosiva, além de amendoins crocantes. Desfrute dessa combinação perfeita!");
					
					break;
                    case 3:
                    	
                    	System.out.println("Massa gelada de baunilha com uma supercamada de cobertura de morango, chocolate e caramelo e ainda por cima com farofa de paçoca. O canudo completa a tentação.");
					
					break;
					case 4:
						
                    System.out.println("Não é uma sobremesa qualquer, é um verdadeiro colosso. Uma supercasquinha de biscoito em forma de cone, recheada com massa gelada de baunilha e uma sensacional cobertura de caramelo ou chocolate. E, além de todo esse sabor, um canudinho de biscoito supercrocante.");
						
						break;
					case 5:
							
						System.out.println("O mais delicioso iogurte desnatado sabor morango.");
						
							break;
				    case 6:
								
				    	System.out.println("Boa demais. Parece a receita lá de casa. Massa quentinha e crocante envolvendo deliciosos recheios de banana ou maçã com gostinho de doce caseiro.");
				    	
								break;
				    case 7:
									
				    	System.out.println("Deliciosamente cremoso. O novo McShake Morango ou Ovomaltine ou Kopenhagen é feito com leite e batido na hora. Uma delícia!");
				    	
									break;
					case 8:
						
						System.out.println("Sobremesa dentro da sobremesa? Temos! Pra sua #FomeGeladinhadeMéqui, chegou os novos McFlurrys M&Ms, com massa gelada sabor baunilha, deliciosos e coloridos M&Ms ao leite e calda de chocolate,tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e trazem o sabor único que só o chocolate ou morango ou caramelo ao leite Kopenhagen têm,McFlurry Ovomaltine, com massa gelada de baunilha, flocos de ovomaltine e cobertura sabor chocolate.");
										
										break;
				}
				
				break;
			case 11:
				
				System.out.println("1 - Coca");
				System.out.println("2 - Fanta");
				System.out.println("3 - Suco");
				System.out.println("4 - Agua");
				
				int bebida = ler.nextInt();
				
				switch (bebida) {
				
				case 1:
					
					System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero.");
					
					break;
				case 2:
					
					System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre, Fanta Guaraná e Fanta Laranja.");
					
					break;
				case 3:
					
					System.out.println("Deliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
					
					break;
				case 4:
					
					System.out.println("Água sem gás.");
					
					break;
					
				
				}
				
				break;
			case 12:
				
				System.out.println("1 - Queijo Quente");
				System.out.println("2 - Croissant de Presunto e Queijo");
				System.out.println("3 - Pão de Queijo");
				System.out.println("4 - Capuccino");
				System.out.println("5 - Café com Leite ");
				System.out.println("6 - Café Premium");
				System.out.println("7 - Chocolate Quente");
				
				int cafe = ler.nextInt();
				
			    switch (cafe) {
			    
			    case 1:
			    	
			    	System.out.println("Composto por pão sem gergelim e duas fatias do delicioso queijo sabor cheddar.");
			    	
			    	break;
			    case 2:
			    	
			    	System.out.println("Nem tente resistir. Só de olhar a imagem já dá vontade de devorar. A massa é fresquinha, crocante e deliciosa. O recheio é de presunto quentinho com queijo derretido. Impossível resistir!");
			    	
			    	break;
			    case 3:
			    	
			    	System.out.println("Impossível de resistir. Pão de queijo quentinho e macio. Quem já provou sabe que não tem igual.");
			    	
			    	break;
			    case 4:
			    	
			    	System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó.");
			    	
			    	break;
			    case 5:
			    	
			    	System.out.println("O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
			    	
			    	break;
			    case 6:
			    	
			    	System.out.println("O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
			    	
			    	break;
			    case 7:
			    	
			    	System.out.println("Feito com leite semidesnatado e chocolate em pó.");
			    	
			    	break;
			    }
				
				break;
			case 13:
				
				System.out.println("1 - Capuccino");
				System.out.println("2 - Café com Leite ");
				System.out.println("3 - Café Premium");
				System.out.println("4 - Chocolate Quente");
				
				
				int bebiquen = ler.nextInt();
			 
			switch (bebiquen) {
			case 1:
			    	
			    	System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó.");
			    	
			    	break;
			    case 2:
			    	
			    	System.out.println("O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
			    	
			    	break;
			    case 3:
			    	
			    	System.out.println("O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
			    	
			    	break;
			    case 4:
			    	
			    	System.out.println("Feito com leite semidesnatado e chocolate em pó.");
			    	
			    	break;
			    }
				
				break;
			case 14:
				
				System.out.println("Ofertas para você e toda sua família");
				
				break;
			case 15:
				
				System.out.println("McBOX combo para toda a família");
				
				break;
				
				
			}
			
			break;	
        	case 2:
        		System.out.println();
        		System.out.println("Bem vindo aos lançamentos, aqui você ficará antenado a qualquer lançamento do mec");
    			System.out.println();
    			System.out.println("1 - 8 países. 8 sanduíches. Experimente.");
    			System.out.println("2 - A novidade que faltava!");
    			System.out.println("3 - Peça pelo combo figurinha!");
    			System.out.println("4 - Novo McFlurry Espetáculo Kopenhagen");
    			System.out.println("5 - Simples assim.");
    			System.out.println("6 - McLanche Feliz");
    			;
    			
    			  int Lança = ler.nextInt();
        			
        			switch (Lança) {
        			
        			case 1:
        				
        				System.out.println("Aqui você pode ver todos os nossos lanches da copa, temos o Mc Brasil, Catar, México, Alemanha, Espanha, Argentina e USA, alem do sundwa Brasil");
        				
        				break;
        			case 2:
        				
        			   System.out.println("Aqui você pode ver todos os nossos molhos Fome de Novidade? Vai de Molho do CBO.\r\n"
        			   		+ "O Molho do CBO (blister 23g) é composto por especiarias e possui sabor e cremosidade icônicos. Vem experimentar o novo Molho do CBO em versão blister e fazer aquela Méquizice!Válido a partir do dia 26/09/2022 enquanto durarem os estoques (limitado a 400 mil unidades).\n Muito Tasty. Muito Méqui.\r\n"
        			   		+ "Único por seu sabor defumado, cremosidade e textura. O Molho Tastyé exclusivo McDonald ́s. Bora experimentar o novo Molho Tasty(blister 23g) fazer aquela Méquiziceque só você sabe? Válido a partir do dia 26/09/2022 enquanto durarem os estoques (limitado a 400 mil unidades). ");	
        				break;
        			case 3:
        				
        				System.out.println("Cola no Méqui!\r\n"
        						+ "Sabia que tá rolando um combo especial aqui no Méqui? McOferta(com bebidas Coca-Cola) + Sobremesa e1 Pacote de Figurinhas. Cola no Méqui e aproveita. Peça pelo Combo Figurinha, válido a partir de 20/09/2022, enquanto durarem os estoques.");
        				
        				break;
        			case 4:
        				
        				System.out.println("Muita cremosidade e muito chocolate pra você!\r\n"
        						+ "Massa geladinha de baunilha, cobertura de morango, chocolate ou caramelo e o delicioso tablete de chocolate ao leite Kopenhagen compõe essa sobremesa trazem o sabor único, com toda a qualidade e sabor a cada mordida.");
        				
        				break;
        			case 5:
        				
        				System.out.println("Café coado com grãos 100% arábicos. Agora na versão de 100ml para você dar um up no seu dia!\n Pra quem já tá pensando em repetir, temos também as versões de 200 e 300ml. Bateu a vontade de provar? Peça um Méqui Sem Fila e retire no seu Méqui favorito. Simples assim.");
        				
        				break;
        				
        			case 6:
        				
        				System.out.println("O #McLanche Feliz tem na sua composição produtos feitos com corantes e aromatizantes naturais. Que tal desfrutar em família?\n O McLanche Feliz tem compromisso com a transparência ");
        				
        				break;
        			}
        		
    		break;
   
        		
        	case 3:
        		System.out.println();
        		System.out.println("Bem vindo, aqui falamos um pouco da nossa empresa.");
    			System.out.println();
    			System.out.println("1 - Institucional");
    			System.out.println("2 - Franquias");
    			System.out.println("3 - Trabalhe conosco");
    			System.out.println("4 - Privacidade");
    			System.out.println("5 - Desenvolvimento Sustentável e Compromisso Social");
    			System.out.println("6 - Publicidade Responsável");
    			
             int Somo = ler.nextInt();
      			
      			switch (Somo) {
      			
      			case 1:
      				
      				System.out.println("A Arcos Dorados é a maior franquia independente direitos exclusivos de possuir, operar e conceder o McDonald’s do mundo e a principal rede de alimentação rápida em toda América Latina e Caribe. A companhia tem as franquias de restaurantes McDonald's em 20 países e territórios, incluindo Argentina, Aruba, Brasil, Chile, Colômbia, Costa Rica, Curaçao, Equador, Guiana Francesa, Guadalupe, Martinica, México, Panamá, Peru, Porto Rico, St. Croix, St. Thomas, Trinidad & Tobago, Uruguai e Venezuela.\r\n"
      						+ "\r\n"
      						+ "Desde sua fundação, em 2007, a companhia preza por compromissos que norteiam sua operação, como qualidade, transparência e segurança do alimento, geração de empregos formais para jovens, apoio às comunidades onde está presente, cadeia de suprimentos sustentável e impacto ambiental, diversidade e inclusão e experiências inovadoras para toda a família.\r\n"
      						+ "\r\n"
      						+ "Atualmente, a rede conta com mais de 2.200 restaurantes em toda América Latina, entre unidades próprias e subfranqueadas, além de mais de 240 McCafés e cerca de 3.300 desert centers. Para isso, contamos com mais de 100 mil funcionários em toda região. No Brasil, são cerca de 1.020 restaurantes, mais de 75 McCafés e 2.010 desert centers, empregando mais de 50 mil pessoas.");
      				
      				break;
      			case 2:
      				
      				System.out.println("Líder absoluto no segmento de alimentação rápida e com produtos de qualidade reconhecida, o McDonald’s é uma das melhores franquias para investir e administrar. O modelo de negócios apoiado pelas franquias foi o fator que permitiu ao McDonald’s se tornar a rede de restaurantes de maior sucesso do mundo.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Entre os motivos que fazem do McDonald’s líder em seu segmento, estão:\r\n"
      						+ "\r\n"
      						+ "✔ Marca com reconhecimento mundial\r\n"
      						+ "\r\n"
      						+ "✔ Modelo de negócios testado e bem-sucedido\r\n"
      						+ "\r\n"
      						+ "✔ Sistema que proporciona altos níveis de treinamento\r\n"
      						+ "\r\n"
      						+ "✔ Provedores de excelência\r\n"
      						+ "\r\n"
      						+ "✔ Oferece rede de suporte profissional\r\n"
      						+ "\r\n"
      						+ "✔ Desde suas origens, desenvolveu as franquias como modelo de\r\n"
      						+ "\r\n"
      						+ "negócio predominante\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Quero ser um franqueado!\r\n"
      						+ "\r\n"
      						+ "Para entrar em contato com a área de Franquias da Rede, envie um e-mail para infofranquia@br.mcd.com");
      				
      				break;
      			case 3:
      				
      				System.out.println("Com mais de 50 mil funcionários no Brasil, o McDonald's é um dos maiores empregadores de jovens do país. Todos os anos, realizamos o sonho do primeiro emprego de muita gente! Do nosso atual quadro de funcionários, cerca de 76% têm menos de 25 anos de idade e estão em sua primeira experiência.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Somos uma das empresas que mais oferece chances de ascensão profissional. Pois, quem trabalha com a gente tem várias oportunidades de desenvolvimento. Incentivamos o estudo e o aprimoramento, e temos orgulho de dizer que hoje aqui no Brasil, mais da metade dos gerentes ingressaram na companhia como atendentes, o primeiro degrau na escala hierárquica da empresa. Anualmente, são investidos cerca de R$40 milhões em treinamento e desenvolvimento de funcionários.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Aqui, todos têm espaço e oportunidade, não admitimos discriminação e exigimos o mesmo respeito para todos os nossos funcionários, sem qualquer distinção de sexo, idade, raça, orientação sexual, religião ou aparência física.\r\n"
      						+ "\r\n"
      						+ "\n Quer fazer parte da nossa equipe? ");
      				
      				System.out.println("1 - Atendente ou Jovem Aprendiz");
        			System.out.println("2 - Oportunidades na área corporativa e programa de estágio ");
        			System.out.println("3 -  Se você tem algum tipo de deficiência, será muito bem-vindo neste time");
        			
        			int Tra = ler.nextInt();
          			
          			switch (Tra) {
          			
          			case 1:
          				
          				System.out.println("Cadastrar Currículo");
          				
          				break;
          			case 2:
          				
          				System.out.println("Cadastrar Currículo e diploma");
          				
          				break;
          			case 3:
          				
          				System.out.println("Cadastrar currículo e tipo de deficiência");
          				
          				break;
          			
          			}
      				
      				break;
      			case 4:
      				
      				System.out.println("POLÍTICA DE PRIVACIDADE PARA CLIENTES E USUÁRIOS DO SITE, APP E DEMAIS APLICAÇÕES DE INTERNET  \r\n"
      						+ "\r\n"
      						+ "ARCOS DOURADOS\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "A ARCOS DOURADOS COMÉRCIO DE ALIMENTOS LTDA. (“Arcos Dourados”)  está comprometida com a conscientização dos usuários do site https://www.mcdonalds.com.br, do aplicativo “McDonald’s App” e de demais aplicações de internet de titularidade ou operados pela Arcos Dourados, como o canal de vendas da Arcos Dourados no WhatsApp – “Méqui Zap”, o site de delivery próprio do McDonald’s (“McDelivery Próprio”) e/ou  o “Peça e Retire” (“Usuários”, “Site”, “App”, Méqui Zap,  McDelivery Próprio e Peça e Retire, respectivamente) e clientes que adquirem os produtos e/ou contratam os serviços ofertados no Site, App ou restaurantes da Arcos Dourados (“Clientes”, sendo os Clientes e Usuários referidos aqui em conjunto como “Titulares” ou “vocês”) sobre os dados pessoais coletados e/ou tratados pela Arcos Dourados. Por isso, apresentamos nossa política de privacidade (“Política de Privacidade”), que tem por objetivo fornecer informações claras e precisas aos Titulares acerca do tratamento de dados pessoais realizado pela Arcos Dourados.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Esta política visa apresentar de forma objetiva as características e hipóteses de tratamento de seus dados pessoais realizadas exclusivamente pela Arcos Dourados. Para mais informações acerca do tratamento de dados pessoais realizado no âmbito das atividades da Arcos Dourados, entre em contato com o Encarregado de Proteção de Dados da Arcos Dourados.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "CASO VOCÊ NÃO CONCORDE COM QUAISQUER DAS DISPOSIÇÕES DESTA POLÍTICA DE PRIVACIDADE, POR FAVOR NÃO UTILIZE NOSSO SITE, NOSSO APP OU NOSSAS OUTRAS APLICAÇÕES DE INTERNET, NEM ADQUIRA NOSSOS PRODUTOS OU CONTRATE OS NOSSOS SERVIÇOS.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Quem é o controlador de seus dados pessoais?\r\n"
      						+ "\r\n"
      						+ "A ARCOS DOURADOS COMÉRCIO DE ALIMENTOS LTDA., sociedade inscrita no CNPJ/MF sob nº 42.591.651/0001-43, com sede na Alameda Amazonas, nº 253, Alphaville, na Cidade de Barueri/SP, é a empresa controladora dos dados pessoais tratados no âmbito desta Política de Privacidade. Para fins da legislação aplicável, “controlador” é a quem compete as decisões referentes ao tratamento de dados pessoais. Nos termos da Lei Geral de Proteção de Dados Pessoais (Lei n. 13.709/18 ou “LGPD”), a Arcos Dourados é responsável apenas pelas atividades de tratamento de dados pessoais dos Titulares que a própria Arcos Dourados realizar no contexto das suas operações e estabelecimentos, mas não pelas atividades de processamento das empresas franqueadas da Família McDonald’s.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Conforme será detalhado na presente Política de Privacidade, os seus dados pessoais poderão ser compartilhados com empresas franqueadas, franqueadora e empresas do grupo (em conjunto com o McDonald’s, “Família McDonald’s”) e/ou empresas parceiras da Arcos Dourados para fins estritamente relacionados à gestão e operação do Site, do App, do Méqui Zap, do McDelivery Próprio, do Peça e Retire e das demais aplicações de Internet da Arcos Dourados, bem como para aprimoramento dos produtos, programas e serviços oferecidos pela Arcos Dourados, hipóteses em que tais empresas também poderão ser controladoras independentes de seus dados pessoais. Especificamente no que se refere às empresas franqueadas pertencentes à família McDonald’s, podemos compartilhar os dados pessoais dos Titulares com tais empresas, com a finalidade estritamente necessária para viabilizar a fabricação e a entrega de produtos e/ou a prestação dos nossos serviços ao Cliente. Exceto pelas atividades descritas acima, existe a possibilidade de seus dados pessoais serem tratados pelas empresas franqueadas pertencentes à Família McDonald’s para outras finalidades, as quais a Arcos Dourados não tem qualquer ingerência e/ou participação em sua realização. NESTAS CIRCUNST NCIAS, A ARCOS DOURADOS NÃO É RESPONSÁVEL POR TAIS ATIVIDADES DE TRATAMENTO DE DADOS PESSOAIS NOS TERMOS DA LGPD.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Quais dados pessoais tratamos?\r\n"
      						+ "\r\n"
      						+ "A Arcos Dourados trata dados pessoais de Titulares que são coletados e/ou processados: (a) durante o acesso e/ou navegação do Site, do App, do Méqui Zap, do McDelivery Próprio, do Peça e Retire e demais aplicações de Internet da Arcos Dourados; e (b) antes, durante ou após o fornecimento de produtos e/ou prestação dos serviços pela Arcos Dourados. Especificamente, a Arcos Dourados coleta as seguintes informações dos Titulares e/ou Clientes, conforme o caso:\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Informações Cadastrais. Ao criar sua conta no Site, no App, no McDelivery Próprio, do Peça e Retire e/ou ao utilizar o Méqui Zap, o Titular fornecerá os seguintes dados pessoais (conforme aplicável): (i) nome completo, (ii) endereço de e-mail; (iii) endereço residencial e endereço informado para entrega de produtos; (iv) telefones para contato; (v) CPF; (vi) data de nascimento, entre outros dados de identificação ou necessários para o cadastro junto à Arcos Dourados. Alguns destes dados podem ser voluntariamente fornecidos pelo Cliente ao adquirir um produto e/ou contratar algum serviço nos restaurantes da Arcos Dourados.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Informações sobre pagamentos. A Arcos Dourados poderá coletar dados transacionais para processamento de compras feitas através do App, do McDelivery Próprio, do Peça e Retire e nos restaurantes do McDonald’s (por exemplo: dados que constam dos cartões de crédito, cartão de débito etc.);  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Informações de navegação e uso. A Arcos Dourados poderá coletar outros dados quando o Usuário utiliza o Site, o App, o Méqui Zap, o McDelivery Próprio ou o Peça e Retire, tais como: geolocalização, páginas visitadas ou anúncios visualizados, dados do device (fingerprint e ID), comportamento de compra e preferências na escolha de produtos, etc. O Usuário pode optar por não fornecer algumas informações, desde que não sejam necessárias para o fornecimento dos produtos, a prestação dos serviços e/ou utilização do Site, do App, do Méqui Zap, do McDelivery Próprio ou do Peça e Retire, mas é provável que a sua experiência com o Site, o App, o Méqui Zap, o McDelivery Próprio ou o Peça e Retire não conte com todos os recursos oferecidos pela Arcos Dourados.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Registros de acesso e demais informações automatizadas. A Arcos Dourados poderá coletar e armazenar algumas informações que recebe automaticamente toda vez que o Usuário interage com o Site, com o App, com o Méqui Zap, com o McDelivery Próprio, com o Peça e Retire e/ou com outras aplicações de internet. Internet Protocol (IP), tipo de navegador, bem como datas e horas das interações do Usuário com as plataformas, são alguns exemplos desta coleta.    \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Registro de visita aos restaurantes da Arcos Dourados e cadastro às redes de Wi-fi. A Arcos Dourados poderá coletar e armazenar algumas informações que recebe automaticamente toda vez que o Cliente visita os restaurantes da Arcos Dourados, tais como as imagens capturadas pelas câmeras de segurança posicionadas na entrada e no interior do restaurante. Ademais, a Arcos Dourados também poderá coletar e armazenar informações quando o Cliente realiza um cadastro nas redes de Wi-fi oferecidas nos restaurantes da Arcos Dourados.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Informações que são recebidas de serviços de delivery Terceiros. A Arcos Dourados poderá receber e armazenar algumas informações a seu respeito que recebe de aplicativos de serviços de delivery que são operados por terceiros (por exemplo, Uber Eats, iFood e Rappi).  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Outras fontes. Por fim, a Arcos Dourados poderá receber e armazenar outras informações a seu respeito, tais como as informações fornecidas por entidades de apoio ao crédito, para fins de evitar fraudes e demais riscos relacionados a transações financeiras eletrônicas.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Para quais finalidades coletamos seus dados?\r\n"
      						+ "\r\n"
      						+ "Os dados pessoais dos Titulares e/ou Clientes, conforme o caso, são tratados pela Arcos Dourados para as seguintes finalidades:\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Disponibilizar aos Titulares um ambiente eletrônico por meio do qual os Usuários podem obter mais informações sobre os produtos e serviços da Arcos Dourados, além de obter informações detalhadas sobre o McDonald’s e/ou a Arcos Dourados;\r\n"
      						+ "\r\n"
      						+ "Viabilizar a formalização da compra de um produto e/ou a contratação de um serviço através do Site, do App, do Méqui Zap, do McDelivery Próprio, do Peça e Retire ou dos restaurantes da Arcos Dourados;\r\n"
      						+ "\r\n"
      						+ "Viabilizar a entrega e/ou retirada de produtos adquiridos através do Site, do App, do Méqui Zap, do McDelivery Próprio ou do Peça e Retire;\r\n"
      						+ "\r\n"
      						+ "Formalizar a participação de Titulares em concursos, prêmios e demais ações promocionais promovidas pela Arcos Dourados;\r\n"
      						+ "\r\n"
      						+ "Prestar e aprimorar o serviço de atendimento aos Titulares, o que podem envolver diversas atividades relacionadas aos produtos adquiridos e/ou aos serviços contratados. Tais atividades incluem, mas não se limitam, ao cadastro de nova senha no Site e/ou no App, geração e emissão de nota fiscal, troca de produtos (por exemplo quando constatado que o seu lacre está rompido), processamento de reclamações, sugestões ou dúvidas sobre produtos, serviços, etc.;\r\n"
      						+ "\r\n"
      						+ "Entrar em contato com os Titulares para informar sobre o processamento de seus pedidos e solicitações, assim como para informar-lhe sobre ofertas, programas, sorteios ou promoções da Arcos Dourados ou de seus parceiros comerciais;\r\n"
      						+ "\r\n"
      						+ "Entrar em contato com os Titulares, para enviar informações sobre: (a) produtos e/ou serviços oferecidos pela Arcos Dourados e demais informações relevante sobre a Arcos Dourados, (b) alterações relevantes nas funcionalidades do Site, do App, do Méqui Zap, do McDelivery Próprio e Peça e Retire (c) outros assuntos que a Arcos Dourados julgue que possam interessar os Titulares;\r\n"
      						+ "\r\n"
      						+ "Aprimorar os serviços e/ou funcionalidades do Site, do App, do Méqui Zap, do McDelivery Próprio e/ou do Peça e Retire;  \r\n"
      						+ "\r\n"
      						+ "Aprimorar as iniciativas comerciais e promocionais da Arcos Dourados, bem como melhorar nossa oferta de conteúdos e produtos personalizados que possam interessar os Titulares, o que pode incluir o desenvolvimento de campanhas de marketing;  \r\n"
      						+ "\r\n"
      						+ "Fornecer serviços de conectividade WI-FI nos restaurantes da Arcos Dourados; e  \r\n"
      						+ "\r\n"
      						+ "Classificar e agrupar informações de Titulares, assim como consolidar dados estatísticos a respeito desses, inclusive para definir a composição da base de Usuários do Site, do App, do Méqui Zap, do McDelivery Próprio e do Peça e Retire e o volume de tráfego em nossos servidores.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Com quem compartilhamos seus dados pessoais?\r\n"
      						+ "\r\n"
      						+ "A Arcos Dourados poderá compartilhar seus dados pessoais com terceiros ou parceiros de negócios que sejam relevantes para fins de viabilizar a utilização do Site, do App, do Méqui Zap, do McDelivery Próprio e/ou do Peça e Retire pelos Titulares ou viabilizar a prestação dos serviços ao Cliente. Referido compartilhamento ocorre com base nos seguintes critérios e para as finalidades descritas abaixo.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Prestadores de serviços ou parceiros comerciais: Podemos compartilhar seus dados pessoais com prestadores de serviços ou parceiros comerciais contratados pela Arcos Dourados para fins de: (a) fornecimento de software, sistemas antifraude e/ou ferramenta para gestão de Clientes, (b) processamento das transações por cartão de crédito ou demais meios de pagamento, (c) geração de leads, prospecção de clientes e desenvolvimento de ações de marketing, (d) prestação de serviços logísticos dos pedidos realizados através do Site, do App, do Méqui Zap, do McDelivery Próprio e/ou do Peça e Retire; (e) auxílio no gerenciamento de promoções; (f) prestação de serviços de atendimento ao consumidor; e (f)  gestão e aprimoramento do Site, do App, do Méqui Zap, do McDelivery Próprio e/ou do Peça e Retire. Tais agentes recebem seus dados pessoais com a finalidade específica de prestar serviços à Arcos Dourados e não possuem quaisquer direitos de uso de seus dados fora dessa hipótese.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Requisição de autoridade competente: A Arcos Dourados ainda poderá compartilhar seus dados pessoais com terceiros (incluindo órgãos governamentais) a fim de responder a investigações, medidas judiciais, processos judiciais ou investigar, impedir ou adotar medidas acerca de atividades ilegais, suspeita de fraude ou situações que envolvam ameaças em potencial à segurança física de qualquer pessoa ou se de outra maneira exigido pela legislação.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Família McDonald’s: Podemos compartilhar os dados pessoais dos Titulares com as demais empresas pertencentes à Família McDonald’s, com a finalidade estritamente necessária para viabilizar a fabricação e a entrega de produtos e/ou a  prestação dos nossos serviços ao Cliente.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Novos negócios: Se a Arcos Dourados estiver envolvida em uma fusão, aquisição ou venda de todos ou de parte de seus ativos, seus dados pessoais poderão ser transferidos para a empresa ou pessoa adquirente. Em circunstâncias nas quais a identidade do controlador de seus dados pessoais se alterar como resultado de qualquer transação, você será notificado de quaisquer escolhas que possa ter acerca de seus dados pessoais.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "E a transferências de seus dados pessoais para fora do Brasil?\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "A Arcos Dourados poderá transferir alguns de seus dados pessoais a prestadores de serviços ou à Família McDonald’s localizados no exterior, incluindo prestadores de serviços em nuvem.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Quando seus dados pessoais forem transferidos para fora do Brasil pela Arcos Dourados, a Arcos Dourados adotará medidas apropriadas para garantir a proteção adequada de seus dados pessoais em conformidade com os requisitos da legislação aplicável de proteção de dados, incluindo a celebração de contratos apropriados de transferência de dados com terceiros quando exigidos.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Por quanto tempo vamos reter seus dados pessoais?\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "A Arcos Dourados armazena e mantém suas informações: (i) pelo tempo exigido por lei; (ii) até o término do tratamento de dados pessoais, conforme mencionado abaixo; ou (iii) pelo tempo necessário a preservar o legítimo interesse da Arcos Dourados. Assim, seus dados serão tratados, por exemplo, durante os prazos prescricionais aplicáveis ou enquanto necessário para cumprimento de obrigação legal ou regulatória.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "O término do tratamento de dados pessoais ocorrerá nos seguintes casos:\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Quando a finalidade pela qual os dados pessoais do Titular foram coletados for alcançada e/ou os dados pessoais coletados deixarem de ser necessários ou pertinentes ao alcance de tal finalidade;\r\n"
      						+ "\r\n"
      						+ "Quando o Titular estiver em seu direito de solicitar o término do tratamento e a exclusão de seus dados pessoais e o fizer; ou\r\n"
      						+ "\r\n"
      						+ "Quando houver uma determinação legal neste sentido.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Nesses casos de término de tratamento de dados pessoais, ressalvadas as hipóteses estabelecidas pela legislação aplicável ou pela presente Política de Privacidade, os dados pessoais serão eliminados.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Quais são os seus direitos em relação aos dados pessoais que tratamos sobre você?\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Você terá determinados direitos em relação aos seus dados pessoais. Tais direitos incluem, mas não se limitam a:\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Receber informações claras e completas sobre o tratamento de seus dados pessoais, incluindo sobre as hipóteses de compartilhamento de dados pessoais;  \r\n"
      						+ "\r\n"
      						+ "Solicitar o acesso a seus dados pessoais e/ou a confirmação da existência de tratamento de dados;  \r\n"
      						+ "\r\n"
      						+ "Solicitar que retifiquemos quaisquer dados pessoais imprecisos, incompletos e desatualizados;\r\n"
      						+ "\r\n"
      						+ "Se opor às atividades de tratamento, solicitar a anonimização e eliminação de dados pessoais, em circunstâncias específicas;\r\n"
      						+ "\r\n"
      						+ "Solicitar a portabilidade de seus dados pessoais;\r\n"
      						+ "\r\n"
      						+ "Revogar o consentimento a qualquer momento, quando a Arcos Dourados tratar seus dados pessoais com base no consentimento; e\r\n"
      						+ "\r\n"
      						+ "Solicitar a revisão de decisões automatizadas que possam afetar seus interesses.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Você poderá exercer tais direitos mediante contato com o Encarregado de Proteção de Dados.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Proteção de dados pessoais\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "A Arcos Dourados utiliza medidas técnicas e organizacionais apropriadas para proteger seus dados pessoais contra tratamento desautorizado ou ilegal e contra perda acidental, destruição ou danos. Seus dados pessoais são armazenados de maneira segura em equipamentos protegidos. Apenas um número limitado de pessoas terá acesso a tais equipamentos e apenas indivíduos com motivos legítimos terão acesso a seus dados pessoais.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Alterações a esta Política de Privacidade\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "A Arcos Dourados reserva-se o direito de alterar esta Política de Privacidade a qualquer momento, mediante publicação da versão atualizada no endereço https://www.mcdonalds.com.br/ privacidade. Em caso de alterações relevantes nesta Política de Privacidade, o Titular receberá um aviso a esse respeito.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Interações com sites de terceiros\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Podemos disponibilizar links para outros sites na Internet. A ARCOS DOURADOS NÃO SE RESPONSABILIZA POR ESTES SITES E CONTEÚDOS E, AINDA, NÃO COMPARTILHA, SUBSCREVE, MONITORA, VALIDA OU ACEITA A FORMA COMO ESSES SITES OU FERRAMENTAS DE ARMAZENAMENTO DE CONTEÚDO COLETAM, PROCESSAM E TRANSFEREM SUAS INFORMAÇÕES PESSOAIS. Recomendamos que o Titular consulte as respectivas políticas de privacidade de tais sites para se informar adequadamente a respeito do uso de suas informações pessoais por outros sites ou outras ferramentas.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Dúvidas sobre esta Política de Privacidade\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Se você tiver qualquer dúvida em relação a esta Política de Privacidade ou a respeito da forma como a Arcos Dourados trata seus dados pessoais, você deverá entrar em contato pelo e-mail: privacidade.lgpd@br.mcd.com ou pelo endereço: Alameda Amazonas, 253, Alphaville, Barueri/SP, CEP 06454-070.  \r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Atualizada em: 02/09/2022");
      				
      				break;
      			case 5:
      				
      				System.out.println("RECEITA DO FUTURO\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Na Arcos Dorados, temos o compromisso de ser uma parte ativa da solução aos desafios que nossa sociedade enfrenta atualmente, sempre trazendo propostas inovadoras. Dessa forma, nasceu nossa estratégia socioambiental “Receita do Futuro”, promovida com o objetivo de impactar positivamente os setores onde temos mais oportunidades de alcançar mudanças significativas. A \"Receita do Futuro\" está no centro dos nossos valores e direciona a maneira de fazermos a diferença no meio ambiente e nas comunidades onde estamos presentes, ao lado de milhões de clientes, funcionários, fornecedores e empresas do setor.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Pilares de atuação:\r\n"
      						+ "\r\n"
      						+ "Como empresa líder na região, assumimos a responsabilidade de atuar em seis frentes prioritárias.\r\n"
      						+ "\r\n"
      						+ "Emprego Jovem - Somos o maior empregador de jovens da América Latina, dando a oportunidade a milhares de pessoas de conquistarem seu primeiro emprego formal.\r\n"
      						+ "\r\n"
      						+ "Mudanças Climáticas - Implementamos ações para minimizar os impactos ambientais em toda nossa cadeia de operações.\r\n"
      						+ "\r\n"
      						+ "Embalagem e Reciclagem - Priorizamos a utilização de materiais renováveis e buscamos promover a mudança de antigos hábitos em nossos restaurantes.\r\n"
      						+ "\r\n"
      						+ "Fornecimento Sustentável - Promovemos o bem-estar animal e buscamos ingredientes produzidos com respeito ao meio-ambiente.\r\n"
      						+ "\r\n"
      						+ "Família e Bem-estar - Mantemos nosso compromisso com as famílias, evoluindo as opções de nosso menu com foco em oferecer mais qualidade de vida.\r\n"
      						+ "\r\n"
      						+ "Diversidade e Inclusão - Promovemos equipes diversificadas e um ambiente de trabalho que estimule o respeito e incentive a participação de todas as pessoas, favorecendo a inclusão e a igualdade de oportunidades.");
      				
      				break;
      			case 6:
      				
      				System.out.println("PUBLICIDADE RESPONSÁVEL E CRITÉRIOS NUTRICIONAIS\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Em 2007, o McDonald's tornou público seu código de ética publicitária no Brasil. O objetivo dessa iniciativa foi o de tornar público o compromisso da empresa no tocante à publicidade da marca.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Em complementação a estas práticas, em 2009 o McDonald's Brasil, através da Arcos Dorados  que possui a licença para operar a marca no Brasil, assinou, juntamente com 22 outras empresas precursoras, o compromisso brasileiro elaborado pela Associação Brasileira de Anunciantes (ABA) em conjunto com a Associação Brasileira das Indústrias de Alimentos (ABIA) sobre publicidade dirigida ao público infantil em complemento às normas anteriormente estabelecidas pelo CONAR (Conselho Nacional de Auto-regulamentação Publicitária).\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Em 2016, em conjunto com um grupo de empresas do setor de alimentos e bebidas no Brasil, assumimos o compromisso de ampliar nosso papel na política de marketing e publicidade responsável para crianças, com avanços nas diretrizes estabelecidas em 2009, por meio da padronização de critérios nutricionais únicos e da estruturação de um processo de monitoramento independente e imparcial.  Importante destacar que somos o único restaurante deste compromisso.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "No tema, aqui no Brasil, ainda seguimos os compromissos globais do McDonald’s e, localmente, os compromissos da Arcos Dorados em toda América Latina (clique aqui e saiba mais).\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "E, por falar em critérios nutricionais, desde 2011, a Arcos Dorados, que sempre teve um cuidado especial com a composição nutricional do seu menu infantil, passou a ofertar produtos diferentes do seu cardápio tradicional, tendo já oferecido ao longo dos anos cenourinha, maçã, suco e purê de maçã 100% fruta.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Em 2019, tivemos a mais recente mudança nutricional no Combo do McLanche Feliz: com opções de diferentes grupos alimentares, redução das gorduras, do sódio e do açúcar adicionado e trabalhando apenas com corantes e aromatizantes naturais.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "O menu sugerido após a mudança conta com sanduíche com presença de vegetais, petit suisse sem corante e aromatizantes artificias como sobremesa, e água e as McFritas Kids. Nossa prioridade é servir comida de qualidade, gerando momentos deliciosos. É por isso que assumimos um forte compromisso não só em relação à publicidade, mas também com o cardápio que oferecemos e com as famílias que consomem nossos produtos todos os dias.");
      				
      				break;
      			
      			
      			
      			
      			
      			
      			}
        		
            break;
        		
        	case 4:
        		System.out.println();
        		System.out.println("Nesse local nosso princípal objetivo é atender sua família");
    			System.out.println();
    			System.out.println("1 - McLanche Feliz");
    			System.out.println("2 - Lançamento");
    			System.out.println("3 - Méqui Box");
    			System.out.println("4 - McLanche Feliz App");
    			System.out.println("5 - Compromisso com as famílias");
    			
    			int Fam = ler.nextInt();
      			
      			switch (Fam) {
      			
      			case 1:
      				
      				System.out.println("É um cardápio infantil variado que atende aos critérios nutricionais globais da empresa, composto por: um sanduíche ou Chicken McNuggets, um acompanhamento (sendo McFritas Kids ou Tomatinho), uma sobremesa (Petit Suisse) e uma bebida (água mineral 500 ml). Além disso, inclui um brinquedo.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Ao longo dos anos, fomos transformando o cardápio do McLanche Feliz e adaptando os ingredientes em busca de uma proposta que seja confiável para os pais, por oferecerem mais benefícios nutricionais, e ao mesmo tempo gostosa e divertida para as crianças.O McLanche Feliz tem na sua composição produtos feitos com corantes e aromatizantes naturais. Que tal desfrutar em família?");
      				
      				break;
      			case 2:
      				
      				System.out.println("Nova rota: Méqui. \r\n"
      						+ "\r\n"
      						+ "Que tal juntar a família pra ter um momento de muita diversão no Méqui com os Carros na Estrada? \r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Devido à pandemia Covid-19 estamos tendo instabilidades na entrega de brinquedos em algumas regiões do país. A disponibilidade dos modelos de brinquedos poderá variar entre os restaurantes.\n Dentre os brinquedos temos o McQueen,Cruz Ramirez, Mate, Relâmpago McQueen, Aventureiro Mate, Ivy, Homem das cavernas Relâmpago McQueen e Homem das cavernas Mate");
      				
      				break;
      			case 3:
      				
      				System.out.println("Méqui Box\r\n"
      						+ "Um jeito fácil e econômico de pedir Méqui para todo tipo de família e de galera");
      				
      				break;
      			case 4:
      				
      				System.out.println("Você pode baixar gratuitamente para os seus filhos o McLanche Feliz App para iOS ou Android.\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Jogos, atividades e muitas outras surpresas para diversão em família.");
      				
      				System.out.println("1 - Android");
        			System.out.println("2 - Iphone");
      				
        			int Loop = ler.nextInt();
          			
          			switch (Loop) {
          			
          			case 1:
          				
          				System.out.println("Download App do seu filho no seu android...");
          				
          				break;
          				
          			case 2:
          			
          				System.out.println("Download App do seu filho no seu Iphone (Burgues)");
          			}
                    break;		
                    
      			case 5:
      			
      				System.out.println("Compromisso com a nutrição e a importância de bons hábitos alimentares. Todos os dias, milhões de famílias visitam nossos restaurantes. Como uma empresa líder e comprometida com a sociedade, temos consciência da importância de aspectos como a qualidade nutricional, a segurança alimentar de nossos produtos e a necessidade de levar um estilo de vida equilibrado. Queremos que os pais possam estar tranquilos em oferecer um McLanche Feliz aos seus filhos e mostrar a eles que estamos trabalhando continuamente para adaptar os produtos do menu do McLanche Feliz às necessidades nutricionais das crianças, contribuindo para que adquiram bons hábitos alimentares, sem perder a diversão associada à marca. Sabemos que a nutrição é uma questão muito importante para as famílias, o que nos levou a assumir os seguintes compromissos:\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "• O compromisso de remover corantes e aromatizantes artificiais do menu do McLanche Feliz, substituindo-os por alternativas naturais, sem prejudicar a segurança do alimento, sabor, qualidade e valor reforçando o trabalho constante com a inovação alimentar. Os gostos e preferências dos consumidores continuam a evoluir e continuaremos a procurar maneiras de simplificar os ingredientes enquanto podemos.Saiba mais em: https://recetadelfuturo.com/\r\n"
      						+ "\r\n"
      						+ "• Compromisso de transparência nas informações nutricionais. Certifique-se de que as informações nutricionais no menu do McLanche Feliz estão disponíveis e acessíveis por meio de nossos sites e aplicativos usados ​​para fazer pedidos.\r\n"
      						+ "\r\n"
      						+ "• O compromisso de realizar práticas responsáveis ​​de comunicação e promoção de produtos dirigidos ao público infantil (clique aqui e saiba mais), mantendo critérios nutricionais e trabalhando para atingir os objetivos aplicáveis ​​a cada mercado ou região.\r\n"
      						+ "\r\n"
      						+ "• O compromisso de alavancar estratégias de marketing inovadoras que colaborem no aumento do consumo de frutas e vegetais que contenham os grupos recomendados do McLanche Feliz.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Casa Ronald McDonald: Pelo bem-estar das crianças e de suas famílias.\r\n"
      						+ "\r\n"
      						+ "Nossa Empresa desempenha um papel importante há 44 anos apoiando famílias com crianças em tratamento médico, mantendo-as unidas e próximas aos cuidados médicos de que necessitam. Para isso, opera por meio de três programas emblemáticos: Casas Ronald McDonald, Quartos Familiares e Unidades Pediátricas Móveis, que oferecem bem-estar e apoio a famílias com filhos gravemente enfermos que precisam se deslocar para receber tratamento médico.\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Compromisso com a Leitura\r\n"
      						+ "\r\n"
      						+ "Pensando em toda a família, nós do McDonald’s promovemos a iniciativa Livro ou Brinquedo, incentivamos a leitura e o desenvolvimento da imaginação e da criatividade, fortalecendo os laços familiares por meio desta atividade tão importante que trabalha toda a cognição infantil.\r\n"
      						+ "\r\n"
      						+ "Já são mais de 18 milhões de livros entregues desde 2013, o que nos tornou o maior distribuidor de livros da América Latina e Caribe. Só em 2019, foram mais de 3,4 milhões de livros no McLanche Feliz, mas ainda queremos distribuir muito mais!\r\n"
      						+ "\r\n"
      						+ " \r\n"
      						+ "\r\n"
      						+ "Conheça mais sobre o que temos feito para que, ao escolher um produto, você e sua família tenham a certeza de que estão consumindo uma comida que foi preparada com todo o cuidado, dedicação e atenção a sua origem, procedência e qualidade no nosso e-book “Guia McLanche Feliz Para Pais Curiosos”.");
      			
      			break;
      			
      			}
    	
    			
    			
    			
    			
    			break;
        	
        		
        	case 5:
        		System.out.println();
        		System.out.println("Aqui você pode checar as princípais promoções");
    			System.out.println();
    			System.out.println("1 - Promoções Ifood");
    			System.out.println("2 - Promoções APPMC");
    			
                int Promo = ler.nextInt();
    			
    			switch (Promo) {
    			
    			case 1:
    				
    				System.out.println("Clássicos do Méqui no Ifood \n Até 43% OFF com Ifood \n Fome geladinha de Méqui no sofá");
    				
    				
    			break;
    				
    			case 2:
    				System.out.println("1 - Download app");
        			System.out.println("2 - Promoções ");
    			
        			  int PromoAPP = ler.nextInt();
          			
          			switch (PromoAPP) {
          			
          			case 1:
          				
          				System.out.println("1 - Android");
            			System.out.println("2 - Iphone");
          				
            			int Down = ler.nextInt();
              			
              			switch (Down) {
              			
              			case 1:
              				
              				System.out.println("Download no seu android...");
              				
              				break;
              				
              			case 2:
              			
              				System.out.println("Download no seu Iphone (Burgues)");
              			
              				break;
              			}
          				
              			
              			break;
          			
          			case 2:
          				
          			   System.out.println("Pequenos Preços\r\n"
          			   		+ "Méqui no precinho sempre cai bem, né? Aproveite cupons de até R$9,90.\nOs mais pedidos\r\n"
          			   		+ "Aquelas ofertas que não tem erro.\nPra galera\r\n"
          			   		+ "Junta a turma e vem matar essa #FomeDeMéqui.");
          			
          			
          			break;
          			}
        			
 
        			
        			
        			
        			break;
 
    			}
        		
    			break;
        	
        		
        	case 6:
        		System.out.println();
        		System.out.println("Aqui temos os serviços que o mequi presta pra você");
    			System.out.println();
    			System.out.println("1 - App do mac");
    			System.out.println("2 - Mequi Delivery");
    			System.out.println("3 - Mequi no Ifood");
    			System.out.println("4 - Mequi Zap");
    			System.out.println("5 - Projeto Grafite");
    			System.out.println("6 - Vale Mequi ");
    			System.out.println("7 - Portas Abertas");
    			System.out.println("8 - Drive true");
    			System.out.println("9 - Peça e retire");
    			System.out.println("10 - por calorias");
    			
    			
    			int Pravc = ler.nextInt();
    			
    			switch(Pravc) {
    			
    			case 1:
    				
    				System.out.println("Faça Download do app na aba promoções");
    				
    				break;
    			case 2:
    				
    				System.out.println("Aqui temos o prazer de levar o seu alimento até a sua casa.");
    				
    				break;
    			case 3:
    				
    				System.out.println("Na aba promoções você obtem mais informações de como fazer seu pedido");
    				
    				break;
    			case 4:
    				
    				System.out.println("Já add o Méqui ZAP?\r\n"
    						+ "Aquele contatinho que nunca te deixa no vácuo e sempre manda oferta boa é o nosso.");
    				
    				break;
    			case 5:
    				
    				System.out.println("Fazendo arte por todo o Brasil o Mc tem a responsabilidade de expalhar a cultura e a arte para o povo Brasileiro.");
    				
    				break;
    			case 6:
    				
    				System.out.println("Escolha o seu. \r\n"
    						+ " \r\n"
    						+ "\r\n"
    						+ "Imagina que bonito tirar um desse da carteira? Escolha o valor e compre agora seu Vale Méqui\r\n"
    						+ "\r\n"
    						+ "Vales de 15, 30, 50 e 100 reais");
    				
    				break;
    			case 7:
    				
    				System.out.println("PORTAS ABERTAS\r\n"
    						+ "\r\n"
    						+ " \r\n"
    						+ "\r\n"
    						+ "O programa Portas Abertas foi criado para mostrar as boas práticas que fazem parte do dia a dia nos restaurantes da rede. Uma visita guiada permite conhecer mais sobre os rígidos protocolos de higiene, segurança e controle de qualidade das nossas cozinhas. No Brasil, mais de 10 milhões de pessoas já participaram da visita. Na América Latina o programa já recebeu mais de 15 milhões de visitantes, distribuídos em 20 países.\r\n"
    						+ "\r\n"
    						+ "Por conta da Pandemia, o Portas Abertas mudou e os restaurantes ganharam o reforço do programa McProtegidos, que conta com uma série de medidas adicionais de higiene e segurança para estimular ambientes mais seguros a todos. Para continuar apresentando de forma transparente as novidades e como os restaurantes funcionam, o Phellyx te convida para conhecer a cozinha do McDonald's virtualmente!Em uma experiência única, o vídeo 360º proporciona uma visita guiada com imersão completa nos ambientes do restaurante e autonomia para que você escolha o que quer ver."
    						+ "");
    				
    				break;
    			case 8:
    				
    				System.out.println("Méqui VIP Drive\r\n"
    						+ "Descontos exclusivos e todo o conforto pra você dar aquela passadinha no Méqui.\nDrive-Tudo do Méqui\r\n"
    						+ "No Drive Tudo agora vale bike, skate, moto, patinete, o que você quiser.");
    				
    				break;
    			case 9:
    				
    				System.out.println("Facinho de usar. Confere aqui no passo a passo abaixo:\r\n"
    						+ "\r\n"
    						+ "Baixe o App do Méqui\r\n"
    						+ "\r\n"
    						+ "Entre no Peça e Retire\r\n"
    						+ "\r\n"
    						+ "Faça seu pedido e pague pelo App\r\n"
    						+ "\r\n"
    						+ "Quando estiver chegando no restaurante, aperte o botão começar a preparar.\r\n"
    						+ "\r\n"
    						+ "Escolha como quer retirar seu pedido e aproveite!");
    				
    				break;
    			case 10:
    				
    				System.out.println("É importante salientar que estamos tratando apenas dos lanches e não dos combos");
    			     System.out.println("1 - 0 à 100 calorias");
    			     System.out.println("2 101 à 200 calorias ");
    			     System.out.println("3 - 201 à 300 calorias");
    			     System.out.println("4 - 301 à 400 calorias");
    			     System.out.println("5 - 401 à 500 calorias");
    			     System.out.println("6 - 501 à 600 calorias");
    			     System.out.println("7 - 601 à 700 calorias");
    			     System.out.println("8 - 801 à 900 calorias");
    			     System.out.println("Obs essas informações foram todas tiradas do site https://www.terra.com.br/vida-e-estilo/culinaria/receitas/cozinha/mcdonalds-responde-a-criticas-sobre-excesso-de-sodio-e-gordura,f8893e6998eec310VgnVCM5000009ccceb0aRCRD.html");
    			     
    			     int calo = ler.nextInt();
    			     
    			     switch (calo) {
    			     
    			     case 1:
    			    	 System.out.println("    Item          Kcal");
    			    	 System.out.println("McFritas Kids	    87 ");
    			    	 System.out.println("Molho Barbecue	    46");
    			    	 System.out.println("Molho Agridoce	    45 ");  
    			    	 System.out.println("Molho Hot Mustard	52 ");
    			    	 System.out.println("Molho Caipira	    50 ");
    			    	 System.out.println("Cenouritas	        16 ");
    			    	 System.out.println("Salada	             8 ");
    			    	 
    			    	 break;
    			     case 2:
    			    	 System.out.println("    Item          Kcal");
    			    	 System.out.println("Premium Salad	   104");
    			    	 System.out.println("McNuggets 4	   173 ");
    			    	 
    			    	 break;
    			     case 3:
    			    	 System.out.println("    Item               Kcal");
    			    	 System.out.println("McNuggets 6	        259");
    			    	 System.out.println("McFritas Média	        288 ");
    			    	 System.out.println("McFritas Pequena       206 ");
    			    	 System.out.println("Premium Salad Grill	227 ");
    			    	 System.out.println("Hambúrguer	            245 ");
    			    	 System.out.println("Cheeseburger	        295 ");
    			
    			    	 
    			    	 break;
    			     case 4:
    			    	 System.out.println("    Item               Kcal");
    			    	 System.out.println("McFish	                362 ");
    			    	 System.out.println("Chicken McJunior	    337");
    			    	 System.out.println("Chicken Classic Grill	351 ");
    			    	 System.out.println("Premium Salad Crispy	317 ");
    			    	 
    			    	 
    			    	 break;
    			     case 5:
    			    	 System.out.println("    Item               Kcal");
    			    	 System.out.println("McNuggets 10	        431 ");
    			    	 System.out.println("McFritas Grande	    412");
    			    	 System.out.println("Chicken Bacon Grill	425");
    			    	 System.out.println("Chicken Classic Crispy	441 ");
    			    	 System.out.println("McChicken	            439 ");
    			    	 System.out.println("Cheddar McMelt	        481 ");
    			    	 System.out.println("Big Mac	            491 ");
    			    	 
    			    	 
    			    	 
    			    	 
    			    	 
    			    	 break;
    			     case 6:
    			    	 System.out.println("    Item               Kcal");
    			    	 System.out.println("Quarteirão          	533");
    			    	 System.out.println("McNífico Bacon	        597 ");
    			    	 System.out.println("Chicken Bacon Crispy	515 ");
    			    	 
    			    	break;
    			    	
    			    	
    			     case 7:
    			    	 System.out.println("    Item               Kcal");
    			    	 System.out.println("CBO	                643 ");
    			    	 
    			    	 
    			    	 
    			    	 break;
    			    	 
    			    	 
    			     case 8:
    			    	 System.out.println("    Item               Kcal");
    			    	 System.out.println("Big Tasty	             839 ");
    			    	 System.out.println("Angus Bacon	         861 ");
    			    	 System.out.println("Angus Deluxe	         863");
    			     break;
    			    	 
    			     
    			     
    			     }
    				
    				break;
    			
    			
    			
    			
    			
    			}
        		
    			break;
        	
        		
        	case 7:
        		System.out.println();
        		System.out.println("Tudo sobre o MC dia Feliz");
    			System.out.println();
    			System.out.println("1 - MC Dia Feliz");
    			System.out.println("2 - Sobre a causa");
    			System.out.println("3 - Contato");
    			System.out.println("4 - Receita do Futuro");
    		
    			int mcdiafel = ler.nextInt();
    			
    			switch (mcdiafel) {
    			
    			case 1:
    				
    				System.out.println("O McDia Feliz é o principal evento beneficente do McDonald's e, atualmente, é uma das maiores mobilizações em prol de crianças e adolescentes no Brasil.");
    				
    				break;
    				
    			case 2:
    				
    				System.out.println("\nNa data, toda a renda obtida com a venda de Big Mac é revertida para a causa. A campanha é realizada no país desde 1988,\n gerando recursos para as instituições apoiadas pelo Instituto Ronald McDonald, que atuam para proporcionar mais saúde e qualidade de vida a crianças e adolescentes com câncer e suas famílias.\n Em 2018, o projeto ampliou seu impacto para beneficiar outra causa de grande importância para o país, a Educação, contribuindo para as ações do Instituto Ayrton Senna.\n Desde sua primeira edição, cerca de R$ 350 milhões já foram arrecadados pelo McDia Feliz.");
    				break;
    				
    			case 3:
    				
    				System.out.println("Contato SAC McD\r\n"
    						+       "sac@sacmcdonalds.com.br\nContato IRM\r\n"
    						+ "mcdiafeliz@instituto-ronald.org.br\nContato IAS\r\n"
    						+ "mcdiafeliz@ias.org.br");
    				break;
    			case 4:
    				
    				System.out.println("O McDia Feliz é uma das maiores campanhas de arrecadação de fundos para as causas de saúde e educação do país e, hoje, essa iniciativa faz parte de uma consolidada estratégia socioambiental da Arcos Dorados (link – www.arcosdorados.com), franquia operadora da marca McDonald’s em 20 países da América Latina e Caribe.\r\n"
    						+ "\r\n"
    						+ " \r\n"
    						+ "\r\n"
    						+ "Com o propósito de gerar impacto positivo no planeta e na sociedade, a Receita do Futuro é a plataforma ESG da companhia, que engloba os principais compromissos, iniciativas e avanços em seis pilares principais, sendo eles: Economia Circular, Mudanças Climáticas, Abastecimento Sustentável, Emprego Jovem, Família & Bem-Estar e Diversidade & Inclusão.\r\n"
    						+ "\r\n"
    						+ " \r\n"
    						+ "\r\n"
    						+ "Nesse sentido, o McDia Feliz é uma campanha que reforça e nos impulsiona a realizar profundas transformações na vida de milhares de famílias e, permite que por meio desse compromisso, possamos mobilizar e impactar também as comunidades onde estamos presentes. Por isso, anualmente contamos com o apoio e a participação de toda a sociedade para continuar beneficiando milhares de crianças e jovens.\r\n"
    						+ "\r\n"
    						+ " \r\n"
    						+ "\r\n"
    						+ "Para conhecer mais sobre as nossas iniciativas socioambientais, acesse \r\n"
    						+ "\r\n"
    						+ "www.receitadofuturo.com.br");
    			
    			
    			
    			
    			break;
    			
    			
    			}
        		
            
            
            
            
            
            
            
            
            
            default:
            
		}    
		
            
            
		}
		
		else
		System.out.println("Fim da aplicação");
		
		
	}
}