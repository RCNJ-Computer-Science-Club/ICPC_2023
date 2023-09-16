
let input = [
    [ 3, [20, 2], [30, 6], [10, 7] ],
    [ 2, [60, 1], [30, 5] ],
    [ 4, [15, 1], [25, 2], [30, 3], [10, 5] ]
  ]

function main() {
  input.forEach(i => calculate(i[0], i.slice(1)))
}


function calculate(n, sets) {
  let sum = 0, num = 0;

  for (let i = 0; i < n; i++) {
      num = sets[i][0]

      if (i < 1) num *= sets[i][1]
      else       num *= sets[i][1] - sets[i - 1][1]

      sum += num;
  }

  console.log(sum, "miles")
}



main()









