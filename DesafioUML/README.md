# DIO - Trilha Java Básico
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

## Diagrama Iphone

```mermaid
classDiagram
    class Midia{
        - String nome
        - Time tempo
        + getNome(): String
        + getTempo(): Time
    }

    class ReprodutorMidias {
        + Midia midia
        + selecionarMidia(Midia nome)
        + reproduzirMidia(Midia nome)
        + pausarMidia()
    }

    class Volume {
        - int volume
        + getVolume(): int
        + SetVolume(novoVolume: int)
    }

    class ControleVolume{
        + Volume volume
        + aumentarVolume()
        + diminuirVolume()
    }

    class Brilho {
        - int brilho
        + getBrilho(): int
        + setBrilho(novoBrilho: int)
    }

    class ControleBrilho {
        + Brilho brilho
        + aumentarBrilho()
        + diminuirBrilho()
    }
    
    class NavegadorInternet {
        + isConnected(): bool
        + exibirPagina()
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class Contato{
        - String nome
        - long numero
        + getNome() String
        + getNumero() long
        + setNome(novoNome: String, nome: String)
        + setNumero(novoNumero: long, nome: String)
    }
    
    class ChamadaTelefonica {
        + Contato contato
        + efetuarLigacao(Contato nome)
        + atenderLigacao()
        + iniciarCorreioDeVoz()
    }
    
    class Iphone7 {
        - ControleVolume volume
        - ControleBrilho brilho
        - ChamadaTelefonica telefone
        - NavegadorInternet navegador
        - ReprodutorMidias midia
        + destravarTravar()
        + ligarDesligar()
        + printScreen()
    }

    Contato "0..*" *-- ChamadaTelefonica
    Midia "0..*" *-- ReprodutorMidias
    Volume "1..100"*-- ControleVolume
    Brilho "1..100"*-- ControleBrilho
    ControleVolume <|-- Iphone7
    ControleBrilho <|-- Iphone7
    ReprodutorMidias <|-- Iphone7
    NavegadorInternet <|-- Iphone7
    ChamadaTelefonica <|-- Iphone7
    