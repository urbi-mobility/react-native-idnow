#import "RNIDNow.h"
#import "IDnowSDK.h"

@implementation RNIDNow

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(sampleMethod:(NSString *)stringArgument numberParameter:(nonnull NSNumber *)numberArgument callback:(RCTResponseSenderBlock)callback)
{
    
    IDnowSettings *settings = [IDnowSettings new];
    settings.transactionToken = @"TST-TGELW";
    
    IDnowController *idnowController = [[IDnowController alloc] initWithSettings: settings];
    
    callback(@[[NSString stringWithFormat: @"numberArgument: %@ stringArgument: %@, idnow ok: %@", numberArgument, stringArgument, idnowController]]);
}

@end
