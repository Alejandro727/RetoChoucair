Feature: Selección aleatoria de productos

  Scenario: El robot selecciona aleatoriamente 5 productos de una categoría y subcategoría específicas
    Given el usuario está en la página de Tiendas Éxito
    When el usuario selecciona la categoría "nombre de la categoría"
    And el usuario selecciona la subcategoría "nombre de la subcategoría"
    Then el usuario debería ver una lista de productos
    When el usuario elige 5 productos al azar debe tener una cantidad aleatoria entre 1 y 10
    Then el usuario debería ver los detalles de cada producto seleccionado
