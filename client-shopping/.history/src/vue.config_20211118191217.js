const path = require("path");
module.exports = {
    css: {
        loaderOptions: {
            less: {
                javascriptEnabled: true,
            }
        },
        pluginOptions: {
            'style-resources-loader': {
              preProcessor: 'less',
              patterns: [
              // 下面这段是自己加的，根据自己文件的位置来修改
                  path.resolve(__dirname, "src/assets/css/global.less")
              ]
            }
          }
       ————————————————
       版权声明：本文为CSDN博主「trigger-life」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
       原文链接：https://blog.csdn.net/qq_38850058/article/details/82893736
    },
    
    devServer: {
        historyApiFallback: true
      },
    //   module: {
    //     rules: [
    //      {
    //      test: /\.less$/,
    //      loader: 'style-loader!css-loader!less-loader'
    //      },
    //      {
    //      test:/\.css$/,
    //      loader:'css-loader!style-loader',
    //      }
    //     ] 
    //     }  
}