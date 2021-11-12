// O(nlog(n) + mlog(m)) time | O(1) space
function smallestDifference(arrayOne, arrayTwo) {
  arrayOne.sort((a,b) => a-b)
  arrayTwo.sort((a,b) => a-b)

  let one = 0
  let two = 0
  let smallestDiff = Infinity
  let current = Infinity
  let smallestPair = []

  while(one < arrayOne.length && two < arrayTwo.length){
    let first = arrayOne[one]
    let second = arrayTwo[two]

    if (first < second) {
      current = second - first
      one += 1

    } else if (second < first) {
      current = first - second
      two += 1

    } else {
      return [first, second]

    }

    if (smallestDiff > current) {
      smallestDiff = current
      smallestPair = [first, second]

    }

  }
  return smallestPair
}

module.exports = smallestDifference;
