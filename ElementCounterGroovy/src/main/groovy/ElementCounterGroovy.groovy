class ElementCounterGroovy {
  static Map<Integer, Integer> countElements(List<Integer> list) {
    def elementCountMap = [:]

    list.each { element ->
      elementCountMap[element] = elementCountMap.get(element, 0) + 1
    }

    return elementCountMap
  }

  static void main(String[] args) {
    def list = [1, 3, 4, 5, 1, 5, 4]
    def result = countElements(list)
    println(result)
  }
}