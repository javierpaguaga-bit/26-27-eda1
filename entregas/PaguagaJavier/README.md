# Explicacion de elección en EDA

## Propuesta

- Creamos un array de las dirreciones de donde los votos puedan ir (arrayCandidatos), otro cual guarde cada voto que se ha hecho y para que dirrecion ira.

## Justificación del arrayVotos (int)

- Almacenamos en el array los votos para cada candidato.
- El tamaño lo creamos segun " candidatos + 2" para tener el espacio para guarda nuestro candidatos, las respuestas nulas, y las abstenciones.
- El orden del espacio en el array dejaria primero nulo y segundo abstención, ya que candidatos es una variable que puede cambiar y el cual no tenemos limite en, incluso si tuvieramos 20 candidatos, la primera vista seria cuales votos no van hacia ninguno de los candidatos.

## Justificación del arrayCandidatos (String)

- Almacena en otro array los nombres de los candidatos.
- El tamaño de inicializacion lo hariamos segun la cantidad de candidatos.







