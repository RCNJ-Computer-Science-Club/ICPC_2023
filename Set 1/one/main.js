
function main() {
  set = [
    [20, 2],
    [30, 6],
    [10, 7],
  ]

  console.log(calculate(set))
}


function calculate(sets){
  let sum = 0, num = 0;

  for (let i = 0; i < sets.length; i++) {
      num = sets[i][0]

      if (i < 1) num *= sets[i][1]
      else       num *= sets[i][1] - sets[i - 1][1]

      sum += num;
  }

  return sum;
}









main()


