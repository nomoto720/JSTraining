var canvas = document.getElementById('canvas');
var c = canvas.getContext('2d');

c.strokeStyle = 'red';  // 線の色
// パスの開始
c.beginPath();
c.arc(75, 75, 50, 0, 2 * Math.PI, false);
// 描画
c.stroke();

c.fillStyle = 'green';  // 塗りつぶしの色
// パスの開始
c.beginPath();
c.arc(200, 75, 50, 0, 2 * Math.PI, false);
// 描画
c.fill();