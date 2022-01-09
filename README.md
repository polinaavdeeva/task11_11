# task11_11
№11

Заранее придумать не менее 5 различных тестов, охватывающих как типичные, так и 
все возможные граничные (наиболее невероятные и показательные) ситуации.
Как обычно, решение должно быть оформлено в виде отдельной функции / 
функций или класса.
Если в задаче используются регулярные выражения, то вы должны очень хорошо 
понимать, что это, и все особенности применительно к вашей задаче!
Если в вашем решении используется многократная конкатенация строк (не одиндва-три раза, а именно многократная), то для эффективности использовать 
StringBuilder.
В задачах, где необходимо выбрать что-то без повторений, удобным (и эффективным в 
плане быстродействия) будет использовать Set<String> (HashSet<String> или 
TreeSet<String>) для хранения уже выбранных элементов. В задачах, где необходимо строке 
сопоставить какое-то значение, можно воспользоваться Map<String, Integer> 
(HashMap<String, Integer> или TreeMap<String, Integer>).

№11.  Дан текст, состоящий из предложений (см. предыдущую задачу). Необходимо 
пронумеровать предложения в тексте, приписав номер предложения в конце 
предложения (после знака окончания предложения) в квадратных скобках. Пример: 
"Мама мыла раму. Вовочка валял дурака..." –> "Мама мыла раму.[1] Вовочка валял 
дурака.[2].."