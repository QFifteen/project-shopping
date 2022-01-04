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
                    'D:\\vue\\src\\style\\theme.less'
                    ]
              }
        ————————————————
        版权声明：本文为CSDN博主「土生土长的IU」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
        原文链接：https://blog.csdn.net/AIB_Kasic/article/details/107990651
                }
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