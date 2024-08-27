Feature: PetStore Order Management

  Background

  Scenario Outline: Crear un nuevo pedido en PetStore
    When creo una orden con id "<id>", petId "<petId>", quantity "<quantity>", shipDate "<shipDate>", status "<status>", complete "<complete>"

   Examples:
      | id | petId | quantity | shipDate                 | status | complete |
      | 0  | 0     | 0        | 2024-08-27T05:21:38.300Z | placed | true     |

