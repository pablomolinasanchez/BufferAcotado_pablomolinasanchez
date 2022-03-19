
@tag
Feature: Buffer Acotado
 

  @tag1
  Scenario: Crear Buffer
    Given Quiero crear un buffer con capacidad 3
    When Creamos el buffer de capacidad 3
    Then Hemos creado el buffer 
    

  @tag2
  Scenario Outline: Poner elementos en el Buffer
    Given Quiero añadir un <a> al buffer de tamaño 3
    When Añadimos el <a>
    Then Hemos añadido el <a>
    | a | 
    | 4 | 
    | 6 | 
    
  @tag3
  Scenario: Buffer lleno
    Given Quiero saber si el buffer de capacidad 3 está lleno
    When Salimos de dudas de si el buffer está lleno
    Then El buffer no está lleno
    
    @tag4
  Scenario: Buffer vacío
    Given Quiero saber si el buffer de capacidad 3 está vacío
    When Salimos de dudas de si el buffer está vacío
    Then El buffer está vacío