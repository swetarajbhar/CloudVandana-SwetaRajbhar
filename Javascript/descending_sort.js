const arr = [4,90,23,87,24,67,12,82,74];
console.log('INPUT ARRAY :', arr);

const sortedArray = descendingSort(arr);
console.log('ARRAY SORTED IN DESCENDNG ORDER :', sortedArray);

function descendingSort(arr){
	let temp;
	for(let i=0;i<arr.length;i++){
		for(let j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	return arr;
}