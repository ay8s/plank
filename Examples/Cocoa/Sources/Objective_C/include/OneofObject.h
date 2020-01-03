//
// OneofObject.h
// Autogenerated by Plank (https://pinterest.github.io/plank/)
//
// DO NOT EDIT - EDITS WILL BE OVERWRITTEN
// @generated
//

#import <Foundation/Foundation.h>
#import "PlankModelRuntime.h"
@class OneofObjectBuilder;

NS_ASSUME_NONNULL_BEGIN

@interface OneofObject : NSObject<NSCopying, NSSecureCoding>
@property (nonatomic, assign, readonly) NSInteger identifier;

+ (NSString *)className;
+ (NSString *)polymorphicTypeIdentifier;
+ (instancetype)modelObjectWithDictionary:(NSDictionary *)dictionary;
- (instancetype)initWithModelDictionary:(NS_VALID_UNTIL_END_OF_SCOPE NSDictionary *)modelDictionary;
- (instancetype)initWithBuilder:(OneofObjectBuilder *)builder;
- (instancetype)initWithBuilder:(OneofObjectBuilder *)builder initType:(PlankModelInitType)initType;
- (instancetype)copyWithBlock:(PLANK_NOESCAPE void (^)(OneofObjectBuilder *builder))block;
- (BOOL)isEqualToOneofObject:(OneofObject *)anObject;
- (instancetype)mergeWithModel:(OneofObject *)modelObject;
- (instancetype)mergeWithModel:(OneofObject *)modelObject initType:(PlankModelInitType)initType;
- (NSDictionary *)dictionaryObjectRepresentation;
- (BOOL)isIdentifierSet;
@end

@interface OneofObjectBuilder : NSObject
@property (nonatomic, assign, readwrite) NSInteger identifier;

- (instancetype)initWithModel:(OneofObject *)modelObject;
- (OneofObject *)build;
- (void)mergeWithModel:(OneofObject *)modelObject;
@end

NS_ASSUME_NONNULL_END
