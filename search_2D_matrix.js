var searchMatrix = function(matrix, target) {
    // undefined check
    if (matrix == undefined || matrix.length == 0 || 
            matrix[0] == undefined || matrix[0].length == 0) {
        return false;
    }

    // use binary search;
    let rowLength = matrix.length;
    let columnLength = matrix[0].length;
    let row = 0;
    let column = columnLength - 1;
    

    while( row < rowLength && row >= 0 && column < columnLength && column >= 0) {
        let start = matrix[row][column];
        console.log(start);
        if (start > target) {
            column --;
        } else if (start < target) {
            row ++;
        } else {
            // start = target;
            return true;
        }
    }
    return false;
};

let matrix = [[-5]];
let target = -10;
console.log(searchMatrix(matrix,target));