
const input = [
    [ 3, [20, 2], [30, 6], [10, 7] ],
    [ 2, [60, 1], [30, 5] ],
    [ 4, [15, 1], [25, 2], [30, 3], [10, 5] ]
  ]

const main = () => input.forEach(i => calculate(i[0], i.slice(1)))

////////////////////////////////////////
////////// Main Logic Starts ///////////
////////////////////////////////////////
function calculate(n, sets) {
  let speedInMiles = sets[0][0]
  let elapsedTime = sets[0][1]

  let totalMiles = speedInMiles * elapsedTime

  for (let i = 1; i < n; i++) {
      speedInMiles = sets[i][0]
      elapsedTime = sets[i][1] - sets[i - 1][1]
      totalMiles += speedInMiles * elapsedTime
  }

  console.log(totalMiles, "miles")
}
////////////////////////////////////////
////////// Main Logic Ends ///////////
////////////////////////////////////////

main()









